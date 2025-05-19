/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

package ADV_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddingElements1a {
    public static void main(String[] args) {
        System.out.println("ArrayList Operations:");
        performArrayListOperations();
        
        System.out.println("\nLinkedList Operations:");
        performLinkedListOperations();
    }
    
    // ArrayList Operations
    public static void performArrayListOperations() {
        // 1. Adding elements
        ArrayList<String> arrayList = new ArrayList<>();
        addElements(arrayList);
        System.out.println("After adding elements: " + arrayList);
        
        // 2. Adding element at specific index
        addElementAtIndex(arrayList, 1, "Mango");
        System.out.println("After adding element at index 1: " + arrayList);
        
        // 3. Adding multiple elements
        addMultipleElements(arrayList, Arrays.asList("Pineapple", "Grapes"));
        System.out.println("After adding multiple elements: " + arrayList);
        
        // 4. Accessing elements
        System.out.println("Element at index 2: " + accessElement(arrayList, 2));
        
        // 5. Updating elements
        updateElement(arrayList, 0, "Green Apple");
        System.out.println("After updating element at index 0: " + arrayList);
        
        // 6. Removing elements
        removeElement(arrayList, "Mango");
        System.out.println("After removing 'Mango': " + arrayList);
        
        // 7. Searching elements
        System.out.println("Index of 'Orange': " + searchElement(arrayList, "Orange"));
        
        // 8. List size
        System.out.println("List size: " + getListSize(arrayList));
        
        // 9. Iterating over list
        System.out.println("Iterating over list:");
        iterateList(arrayList);
        
        // 10. Using Iterator
        System.out.println("Using Iterator:");
        iterateUsingIterator(arrayList);
        
        // 11. Sorting
        sortList(arrayList);
        System.out.println("After sorting: " + arrayList);
        
        // 12. Sublist
        List<String> subList = getSubList(arrayList, 1, 3);
        System.out.println("Sublist (1 to 3): " + subList);
        
        // 13. Clearing the list
        clearList(arrayList);
        System.out.println("After clearing the list: " + arrayList);
    }
    
    // LinkedList Operations
    public static void performLinkedListOperations() {
        // 1. Adding elements
        LinkedList<String> linkedList = new LinkedList<>();
        addElements(linkedList);
        System.out.println("After adding elements: " + linkedList);
        
        // 2. Adding element at specific index
        addElementAtIndex(linkedList, 1, "Mango");
        System.out.println("After adding element at index 1: " + linkedList);
        
        // 3. Adding multiple elements
        addMultipleElements(linkedList, Arrays.asList("Pineapple", "Grapes"));
        System.out.println("After adding multiple elements: " + linkedList);
        
        // 4. Accessing elements
        System.out.println("Element at index 2: " + accessElement(linkedList, 2));
        
        // 5. Updating elements
        updateElement(linkedList, 0, "Green Apple");
        System.out.println("After updating element at index 0: " + linkedList);
        
        // 6. Removing elements
        removeElement(linkedList, "Mango");
        System.out.println("After removing 'Mango': " + linkedList);
        
        // 7. Searching elements
        System.out.println("Index of 'Orange': " + searchElement(linkedList, "Orange"));
        
        // 8. List size
        System.out.println("List size: " + getListSize(linkedList));
        
        // 9. Iterating over list
        System.out.println("Iterating over list:");
        iterateList(linkedList);
        
        // 10. Using Iterator
        System.out.println("Using Iterator:");
        iterateUsingIterator(linkedList);
        
        // 11. Sorting
        sortList(linkedList);
        System.out.println("After sorting: " + linkedList);
        
        // 12. Sublist
        List<String> subList = getSubList(linkedList, 1, 3);
        System.out.println("Sublist (1 to 3): " + subList);
        
        // 13. Clearing the list
        clearList(linkedList);
        System.out.println("After clearing the list: " + linkedList);
    }
    
    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }
    
    // 2. Adding element at specific index
    public static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
    }
    
    // 3. Adding multiple elements
    public static void addMultipleElements(List<String> list, List<String> elementsToAdd) {
        list.addAll(elementsToAdd);
    }
    
    // 4. Accessing elements
    public static String accessElement(List<String> list, int index) {
        return list.get(index);
    }
    
    // 5. Updating elements
    public static void updateElement(List<String> list, int index, String newElement) {
        list.set(index, newElement);
    }
    
    // 6. Removing elements
    public static void removeElement(List<String> list, String element) {
        list.remove(element);
    }
    
    // 7. Searching elements
    public static int searchElement(List<String> list, String element) {
        return list.indexOf(element);
    }
    
    // 8. List size
    public static int getListSize(List<String> list) {
        return list.size();
    }
    
    // 9. Iterating over list
    public static void iterateList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
    
    // 10. Using Iterator
    public static void iterateUsingIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
    }
    
    // 12. Sublist
    public static List<String> getSubList(List<String> list, int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }
    
    // 13. Clearing the list
    public static void clearList(List<String> list) {
        list.clear();
    }
}