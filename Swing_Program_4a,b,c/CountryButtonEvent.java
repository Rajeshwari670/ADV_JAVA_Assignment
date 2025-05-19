/* Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).  */


package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class CountryButtonEvent {
	    public static void main(String[] args) {
	        // Create the JFrame
	        JFrame frame = new JFrame("Button Event Demo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLayout(new FlowLayout());
	        
	        // Create the JLabel to display the message
	        JLabel messageLabel = new JLabel("Press a button!");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
	        
	        // Create the Srilanka button
	        JButton srilankaButton = new JButton("Srilanka");
	        
	        // Create the India button
	        JButton indiaButton = new JButton("India");
	        
	        // Add ActionListener for Srilanka button
	        srilankaButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });
	        
	        // Add ActionListener for India button
	        indiaButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });
	        
	        // Add components to the frame
	        frame.add(srilankaButton);
	        frame.add(indiaButton);
	        frame.add(messageLabel);
	        
	        // Make the frame visible
	        frame.setVisible(true);
	    
	    }
}


	
