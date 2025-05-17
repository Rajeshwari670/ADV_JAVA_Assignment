/* Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */

package ADV_JAVA;
import java.util.ArrayList;


public class ArrayList_1b_6 {
	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();
	        
	        // Add different colors to the ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");
	        
	        // Specify the nth element to remove (e.g., 3rd element, index 2)
	        int n = 3;
	        
	        // Display original list
	        System.out.println("Original Colors List:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        
	        // Check if the index is valid
	        if (n > 0 && n <= colors.size()) {
	            // Remove the nth element (n-1 for zero-based index)
	            colors.remove(n - 1);
	            
	            // Display list after removal
	            System.out.println("\nColors List after removing " + n + "th element:");
	            for (String color : colors) {
	                System.out.println(color);
	            }
	        } else {
	            System.out.println("\nInvalid index: " + n + ". List size is " + colors.size() + ".");
	        }
	    }
	}
	


