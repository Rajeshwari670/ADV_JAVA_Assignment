/* Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty(). */



package ADV_JAVA;

public class NullOrEmptyCheck {
	    // User-defined function to check if a string is null or contains only whitespace
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = null;
	        String str2 = "";
	        String str3 = "   ";
	        String str4 = "Hello, World!";
	        String str5 = "  Spaces  ";
	        
	        // Check and display results
	        System.out.println("Testing string: null -> isNullOrEmpty: " + isNullOrEmpty(str1));
	        System.out.println("Testing string: \"\" -> isNullOrEmpty: " + isNullOrEmpty(str2));
	        System.out.println("Testing string: \"   \" -> isNullOrEmpty: " + isNullOrEmpty(str3));
	        System.out.println("Testing string: \"Hello, World!\" -> isNullOrEmpty: " + isNullOrEmpty(str4));
	        System.out.println("Testing string: \"  Spaces  \" -> isNullOrEmpty: " + isNullOrEmpty(str5));
	    }
	}


