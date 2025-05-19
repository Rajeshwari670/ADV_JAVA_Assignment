/* Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan  */


package ADV_JAVA;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneCMY extends JFrame {
    private JTabbedPane tabbedPane;

    public ColorTabbedPaneCMY() {
        // Initialize the frame
        setTitle("Color Tabbed Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create JTabbedPane
        tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add panels to tabbed pane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add ChangeListener to handle tab selection
        tabbedPane.addChangeListener(e -> {
            String selectedTab = tabbedPane.getTitleAt(tabbedPane.getSelectedIndex());
            System.out.println("Selected Color: " + selectedTab);
        });

        // Add tabbed pane to frame
        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Run on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            ColorTabbedPaneCMY frame = new ColorTabbedPaneCMY();
            frame.setVisible(true);
        });
    }
}


