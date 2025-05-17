

package ADV_JAVA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_1b_4 {
	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();
	        
	        // Add different colors to the ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");
	        colors.add("Orange");
	        
	        // Display original list
	        System.out.println("Original Colors List:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        
	        // Sort the ArrayList using Collections.sort()
	        Collections.sort(colors);
	        
	        // Display sorted list
	        System.out.println("\nSorted Colors List:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}

	    