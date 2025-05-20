/* Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))
*/

package ADV_JAVA;
import java.util.LinkedList;


public class InsertAtEndLinkedList {
	    public static void main(String[] args) {
	        // Create a LinkedList to store colors
	        LinkedList<String> colors = new LinkedList<>();
	        
	        // Add different colors to the LinkedList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        
	        // Display original list
	        System.out.println("Original Colors List:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        
	        // Insert "Pink" at the end of the LinkedList using offerLast
	        colors.offerLast("Pink");
	        
	        // Display list after insertion
	        System.out.println("\nColors List after inserting Pink at the end:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}


