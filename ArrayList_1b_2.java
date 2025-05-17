package ADV_JAVA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_1b_2 {
	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colorsList = new ArrayList<>();
	        
	        // Adding different colors to the ArrayList
	        addColors(colorsList);
	        
	        // Display initial colors
	        System.out.println("Initial Colors List:");
	        displayColors(colorsList);
	        
	        // Remove the 2nd element (index 1)
	        removeElementAtIndex(colorsList, 1);
	        System.out.println("\nAfter removing 2nd element:");
	        displayColors(colorsList);
	        
	        // Remove color "Blue"
	        removeColorByName(colorsList, "Blue");
	        System.out.println("\nAfter removing color \"Blue\":");
	        displayColors(colorsList);
	    }
	    
	    // Method to add colors to the ArrayList
	    private static void addColors(List<String> colors) {
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");
	        colors.add("White");
	        colors.add("Purple");
	        colors.add("Blue");  // Adding Blue again to demonstrate removing all instances
	        
	        // Adding multiple colors at once
	        colors.addAll(Arrays.asList("Pink", "Brown", "Grey"));
	    }
	    
	    // Method to display all colors in the ArrayList
	    private static void displayColors(List<String> colors) {
	        if (colors.isEmpty()) {
	            System.out.println("The colors list is empty.");
	            return;
	        }
	        
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println((i + 1) + ". " + colors.get(i));
	        }
	        System.out.println("Total colors: " + colors.size());
	    }
	    
	    // Method to remove an element at a specific index
	    private static void removeElementAtIndex(List<String> colors, int index) {
	        if (index >= 0 && index < colors.size()) {
	            String removedColor = colors.get(index);
	            colors.remove(index);
	            System.out.println("Removed color at position " + (index + 1) + ": \"" + removedColor + "\"");
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }
	    }
	    
	    // Method to remove all occurrences of a specific color
	    private static void removeColorByName(List<String> colors, String colorName) {
	        int initialSize = colors.size();
	        
	        // Create a copy of the list to avoid ConcurrentModificationException
	        ArrayList<String> tempList = new ArrayList<>(colors);
	        
	        // Remove all instances of the color from the original list
	        colors.removeIf(color -> color.equals(colorName));
	        
	        int removedCount = initialSize - colors.size();
	        
	        if (removedCount > 0) {
	            System.out.println("Removed " + removedCount + " instance(s) of \"" + colorName + "\"");
	        } else {
	            System.out.println("Color \"" + colorName + "\" not found in the list");
	        }
	    }
	}


