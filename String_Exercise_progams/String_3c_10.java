/* Write a Java Program for Counting the number of words in a string using user defined function
countWords()  */

package ADV_JAVA;

public class String_3c_10 {
	    // User-defined function to count the number of words in a string
	    public static int countWords(String str) {
	        // Check for null or empty string
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }
	        
	        // Split the string by one or more whitespace characters
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "Hello, World!";
	        String str2 = "Java   Programming    Language";
	        String str3 = "";
	        String str4 = null;
	        String str5 = "  SingleWord  ";
	        String str6 = "One\nTwo\tThree";
	        
	        // Check and display results
	        System.out.println("String: \"" + str1 + "\" -> Word Count: " + countWords(str1));
	        System.out.println("String: \"" + str2 + "\" -> Word Count: " + countWords(str2));
	        System.out.println("String: \"" + str3 + "\" -> Word Count: " + countWords(str3));
	        System.out.println("String: null -> Word Count: " + countWords(str4));
	        System.out.println("String: \"" + str5 + "\" -> Word Count: " + countWords(str5));
	        System.out.println("String: \"" + str6 + "\" -> Word Count: " + countWords(str6));
	    }
	

}
