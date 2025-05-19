/* Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())
*/


package ADV_JAVA;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList_1c_2 {
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
	        
	        // Create a descending iterator
	        Iterator<String> iterator = colors.descendingIterator();
	        
	        // Iterate through elements in reverse order
	        System.out.println("\nColors in Reverse Order:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

}
