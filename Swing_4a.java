/* Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel */

package ADV_JAVA;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Swing_4a {
	    public static void main(String[] args) {
	        // Create the JFrame
	        JFrame frame = new JFrame("Swing Hello Program");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 200);
	        
	        // Create the JLabel with the specified message
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");
	        
	        // Set font to plain, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));
	        
	        // Set text color to blue
	        label.setForeground(Color.BLUE);
	        
	        // Center the label in the frame
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        
	        // Add the label to the frame
	        frame.add(label);
	        
	        // Make the frame visible
	        frame.setVisible(true);
	    }
	
	

}
