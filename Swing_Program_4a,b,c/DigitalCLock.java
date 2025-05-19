/* Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ). */


package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DigitalCLock {
	    public static void main(String[] args) {
	        // Create the JFrame
	        JFrame frame = new JFrame("Image Button Event Demo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLayout(new FlowLayout());
	        
	        // Create the JLabel to display the message
	        JLabel messageLabel = new JLabel("Press a button!");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
	        
	        // Load images for buttons (replace with actual image paths)
	        // Note: Ensure digital_clock.png and hour_glass.png are in the project directory
	        ImageIcon digitalClockIcon = null;
	        ImageIcon hourGlassIcon = null;
	        try {
	            digitalClockIcon = new ImageIcon("digital_clock.png");
	            hourGlassIcon = new ImageIcon("hour_glass.png");
	        } catch (Exception e) {
	            System.err.println("Image files not found. Using text labels instead.");
	        }
	        
	        // Create the Digital Clock button
	        JButton digitalClockButton = new JButton("Digital Clock"); // Fallback text
	        if (digitalClockIcon != null && digitalClockIcon.getImage() != null) {
	            digitalClockButton.setIcon(digitalClockIcon);
	            digitalClockButton.setText(""); // Remove text if image is available
	        }
	        
	        // Create the Hour Glass button
	        JButton hourGlassButton = new JButton("Hour Glass"); // Fallback text
	        if (hourGlassIcon != null && hourGlassIcon.getImage() != null) {
	            hourGlassButton.setIcon(hourGlassIcon);
	            hourGlassButton.setText(""); // Remove text if image is available
	        }
	        
	        // Add ActionListener for Digital Clock button
	        digitalClockButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });
	        
	        // Add ActionListener for Hour Glass button
	        hourGlassButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });
	        
	        // Add components to the frame
	        frame.add(digitalClockButton);
	        frame.add(hourGlassButton);
	        frame.add(messageLabel);
	        
	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}
	


