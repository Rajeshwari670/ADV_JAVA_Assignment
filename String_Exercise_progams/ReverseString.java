/* Write a Java Program for Reversing the characters in a string using user defined function
reverseString(). */


package ADV_JAVA;

public class ReverseString {
	    // User-defined function to reverse the characters in a string
	    public static String reverseString(String str) {
	        // Check for null or empty string
	        if (str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        // Convert string to char array and reverse
	        char[] chars = str.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;
	        
	        while (left < right) {
	            // Swap characters
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;
	            left++;
	            right--;
	        }
	        
	        // Return reversed string
	        return new String(chars);
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "Hello, World!";
	        String str2 = "Java";
	        String str3 = "";
	        String str4 = null;
	        String str5 = "A";
	        
	        // Check and display results
	        System.out.println("Original: \"" + str1 + "\" -> Reversed: \"" + reverseString(str1) + "\"");
	        System.out.println("Original: \"" + str2 + "\" -> Reversed: \"" + reverseString(str2) + "\"");
	        System.out.println("Original: \"" + str3 + "\" -> Reversed: \"" + reverseString(str3) + "\"");
	        System.out.println("Original: null -> Reversed: \"" + reverseString(str4) + "\"");
	        System.out.println("Original: \"" + str5 + "\" -> Reversed: \"" + reverseString(str5) + "\"");
	    }
	}

	    
