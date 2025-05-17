/* Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) ) */


package ADV_JAVA;
import java.util.LinkedList;

public class LinkedList_1c_4 {
	    public static void main(String[] args) {
	        // Create a LinkedList to store colors
	        LinkedList<String> colors = new LinkedList<>();
	        
	        // Add different colors to the LinkedList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");
	        
	        // Display elements and their positions
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int p = 0; p < colors.size(); p++) {
	            System.out.printf("Position %d: %s%n", p, colors.get(p));
	        }
	    }
	}


