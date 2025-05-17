/* Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/

package ADV_JAVA;
import java.util.LinkedList;
import java.util.Iterator;


public class LinkedList_1c_1 {
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
        
        // Create an iterator starting at index 1 (2nd position)
        Iterator<String> iterator = colors.listIterator(1);
        
        // Iterate through elements starting from 2nd position
        System.out.println("\nColors starting from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

