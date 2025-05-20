/* 1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not
*/


package ADV_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColorSearchInArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();
        addColors(colorsList);
        System.out.println("Available Colors:");
        displayColors(colorsList);
        searchForColor(colorsList, "Red");
        searchForUserInputColor(colorsList);
    }
    private static void addColors(List<String> colors) {
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");
        colors.add("Orange");
        colors.addAll(Arrays.asList("Pink", "Brown", "Grey"));
    }
   
    private static void displayColors(List<String> colors) {
        for (int i = 0; i < colors.size(); i++) {
            System.out.println((i + 1) + ". " + colors.get(i));
        }
        System.out.println("Total colors: " + colors.size());
    }
    private static void searchForColor(List<String> colors, String searchColor) {
        System.out.println("\nSearching for color: " + searchColor);
        
        boolean isColorFound = colors.contains(searchColor);
        
        if (isColorFound) {
            int position = colors.indexOf(searchColor) + 1; 
            System.out.println("\"" + searchColor + "\" is AVAILABLE in the list at position " + position);
        } else {
            System.out.println("\"" + searchColor + "\" is NOT AVAILABLE in the list");
        }
    }
    
    private static void searchForUserInputColor(List<String> colors) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a color to search for:");
        String userColor = scanner.nextLine();
        searchForColor(colors, userColor);
        scanner.close();
    }
}
