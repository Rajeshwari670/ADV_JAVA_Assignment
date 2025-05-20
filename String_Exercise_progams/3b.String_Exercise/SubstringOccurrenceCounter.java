/*  Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences() */


package ADV_JAVA;

public class SubstringOccurrenceCounter {
	    // User-defined function to count occurrences of a substring in a main string
	    public static int countOccurrences(String mainStr, String subStr) {
	        // Check for null or empty strings
	        if (mainStr == null || subStr == null || mainStr.isEmpty() || subStr.isEmpty()) {
	            return 0;
	        }
	        
	        int count = 0;
	        int pos = 0;
	        
	        // Find substring occurrences using indexOf
	        while ((pos = mainStr.indexOf(subStr, pos)) != -1) {
	            count++;
	            pos += subStr.length(); // Move position to avoid overlapping matches
	        }
	        
	        return count;
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String mainStr1 = "Hello, Hello, World!";
	        String subStr1 = "Hello";
	        
	        String mainStr2 = "banana";
	        String subStr2 = "ana";
	        
	        String mainStr3 = "aaaa";
	        String subStr3 = "aa";
	        
	        String mainStr4 = "test";
	        String subStr4 = "";
	        
	        String mainStr5 = null;
	        String subStr5 = "test";
	        
	        // Check and display results
	        System.out.println("Main string: \"" + mainStr1 + "\", Substring: \"" + subStr1 + "\"");
	        System.out.println("Occurrences: " + countOccurrences(mainStr1, subStr1));
	        
	        System.out.println("\nMain string: \"" + mainStr2 + "\", Substring: \"" + subStr2 + "\"");
	        System.out.println("Occurrences: " + countOccurrences(mainStr2, subStr2));
	        
	        System.out.println("\nMain string: \"" + mainStr3 + "\", Substring: \"" + subStr3 + "\"");
	        System.out.println("Occurrences: " + countOccurrences(mainStr3, subStr3));
	        
	        System.out.println("\nMain string: \"" + mainStr4 + "\", Substring: \"" + subStr4 + "\"");
	        System.out.println("Occurrences: " + countOccurrences(mainStr4, subStr4));
	        
	        System.out.println("\nMain string: null, Substring: \"" + subStr5 + "\"");
	        System.out.println("Occurrences: " + countOccurrences(mainStr5, subStr5));
	    }
	}


