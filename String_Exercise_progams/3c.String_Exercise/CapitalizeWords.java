/* Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()  */

package ADV_JAVA;

public class CapitalizeWords {
	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        // Check for null or empty string
	        if (str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        // Split the string into words
	        String[] words = str.trim().split("\\s+");
	        StringBuilder result = new StringBuilder();
	        
	        // Capitalize first letter of each word
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                // Capitalize first character and append rest of the word
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }
	        
	        // Remove trailing space and return
	        return result.toString().trim();
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "hello world";
	        String str2 = "java programming language";
	        String str3 = "";
	        String str4 = null;
	        String str5 = "  single   word  ";
	        String str6 = "ALREADY CAPITALIZED";
	        
	        // Check and display results
	        System.out.println("Original: \"" + str1 + "\" -> Capitalized: \"" + capitalizeWords(str1) + "\"");
	        System.out.println("Original: \"" + str2 + "\" -> Capitalized: \"" + capitalizeWords(str2) + "\"");
	        System.out.println("Original: \"" + str3 + "\" -> Capitalized: \"" + capitalizeWords(str3) + "\"");
	        System.out.println("Original: null -> Capitalized: \"" + capitalizeWords(str4) + "\"");
	        System.out.println("Original: \"" + str5 + "\" -> Capitalized: \"" + capitalizeWords(str5) + "\"");
	        System.out.println("Original: \"" + str6 + "\" -> Capitalized: \"" + capitalizeWords(str6) + "\"");
	    }
	

}
