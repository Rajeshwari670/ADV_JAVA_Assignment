package ADV_JAVA;
import java.util.ArrayList;
import java.util.List;


public class ArrayList_1b_5 {
	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();
	        
	        // Add different colors to the ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");
	        
	        // Display original list
	        System.out.println("Original Colors List:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        
	        // Extract 1st and 2nd elements (index 0 and 1) using subList()
	        // subList(0, 2) gets elements from index 0 to 1 (2 is exclusive)
	        List<String> subColors = colors.subList(0, 2);
	        
	        // Display extracted elements
	        System.out.println("\nExtracted 1st and 2nd Colors:");
	        for (String color : subColors) {
	            System.out.println(color);
	        }
	    }
	}

