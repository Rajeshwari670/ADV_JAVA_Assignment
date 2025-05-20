/* Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList
*/

package ADV_JAVA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementsFromArrayList {
	    public static void main(String[] args) {
	        ArrayList<String> colorsList = new ArrayList<>();
	        addColors(colorsList);
	        System.out.println("Initial Colors List:");
	        displayColors(colorsList);
	        removeElementAtIndex(colorsList, 1);
	        System.out.println("\nAfter removing 2nd element:");
	        displayColors(colorsList);
	        removeColorByName(colorsList, "Blue");
	        System.out.println("\nAfter removing color \"Blue\":");
	        displayColors(colorsList);
	    }
	   
	    private static void addColors(List<String> colors) {
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Blue"); 
	        colors.addAll(Arrays.asList("Pink", "Brown", "Grey"));
	    }
	    
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
	   
	    private static void removeElementAtIndex(List<String> colors, int index) {
	        if (index >= 0 && index < colors.size()) {
	            String removedColor = colors.get(index);
	            colors.remove(index);
	            System.out.println("Removed color at position " + (index + 1) + ": \"" + removedColor + "\"");
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }
	    }
	    private static void removeColorByName(List<String> colors, String colorName) {
	        int initialSize = colors.size();
	        ArrayList<String> tempList = new ArrayList<>(colors);  
	        colors.removeIf(color -> color.equals(colorName));
	        
	        int removedCount = initialSize - colors.size();
	        
	        if (removedCount > 0) {
	            System.out.println("Removed " + removedCount + " instance(s) of \"" + colorName + "\"");
	        } else {
	            System.out.println("Color \"" + colorName + "\" not found in the list");
	        }
	    }
	}


