/* Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.  */


package ADV_JAVA;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Swing_5a {
	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Country List");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 400);
	        frame.setLayout(new BorderLayout());

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList with countries
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        
	        // Add ListSelectionListener to print selected countries
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    // Get all selected items
	                    String[] selectedCountries = countryList.getSelectedValuesList().toArray(new String[0]);
	                    if (selectedCountries.length > 0) {
	                        System.out.println("Selected countries:");
	                        for (String country : selectedCountries) {
	                            System.out.println(country);
	                        }
	                        System.out.println("---");
	                    }
	                }
	            }
	        });

	        // Add JList to a scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        
	        // Add scroll pane to frame
	        frame.add(scrollPane, BorderLayout.CENTER);
	        
	        // Make frame visible
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}


