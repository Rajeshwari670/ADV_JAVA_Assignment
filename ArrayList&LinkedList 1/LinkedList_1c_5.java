/* Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2)) */


package ADV_JAVA;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedList_1c_5 {
	    public static void main(String[] args) {
	        // Create a LinkedList to store colors
	        LinkedList<String> colors = new LinkedList<>();
	        
	        // Add different colors to the LinkedList
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
	        
	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colors, 0, 2);
	        
	        // Display list after swapping
	        System.out.println("\nColors List after swapping first and third elements:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}


