/* Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan.  */



package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorTabbedPaneRGB {
	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Color Tabbed Pane");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLayout(new BorderLayout());

	        // Create JTabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add panels to tabs
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add ChangeListener to detect tab selection
	        tabbedPane.addChangeListener(e -> {
	            String selectedTab = tabbedPane.getTitleAt(tabbedPane.getSelectedIndex());
	            System.out.println("Selected color: " + selectedTab);
	        });

	        // Add tabbed pane to frame
	        frame.add(tabbedPane, BorderLayout.CENTER);

	        // Make frame visible
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}


