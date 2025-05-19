/* Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.  */


package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class CountryList extends JFrame {
	    private JList<String> countryList;
	    private Map<String, String> countryCapitals;

	    public CountryList() {
	        // Initialize the frame
	        setTitle("Country List");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 400);
	        setLocationRelativeTo(null);

	        // Initialize country-capital map
	        countryCapitals = new HashMap<>();
	        countryCapitals.put("USA", "Washington, D.C.");
	        countryCapitals.put("India", "New Delhi");
	        countryCapitals.put("Vietnam", "Hanoi");
	        countryCapitals.put("Canada", "Ottawa");
	        countryCapitals.put("Denmark", "Copenhagen");
	        countryCapitals.put("France", "Paris");
	        countryCapitals.put("Great Britain", "London");
	        countryCapitals.put("Japan", "Tokyo");
	        countryCapitals.put("Africa", "Not a country"); // Note: Africa is a continent
	        countryCapitals.put("Greenland", "Nuuk");
	        countryCapitals.put("Singapore", "Singapore");

	        // Create JList with countries
	        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", 
	                            "France", "Great Britain", "Japan", "Africa", 
	                            "Greenland", "Singapore"};
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        
	        // Add ListSelectionListener to handle selection events
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                String selectedCountry = countryList.getSelectedValue();
	                if (selectedCountry != null) {
	                    System.out.println("Country: " + selectedCountry + 
	                                     ", Capital: " + countryCapitals.get(selectedCountry));
	                }
	            }
	        });

	        // Add JList to scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        
	        // Add scroll pane to frame
	        add(scrollPane, BorderLayout.CENTER);
	    }

	    public static void main(String[] args) {
	        // Run on Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> {
	            CountryList frame = new CountryList();
	            frame.setVisible(true);
	        });
	    }
	}
	


