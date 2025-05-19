/* Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace() */


package ADV_JAVA;

public class WhitespaceRemover {
	    // User-defined function to remove all whitespace characters from a string
	    public static String removeWhitespace(String str) {
	        // Check for null or empty string
	        if (str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        // Replace all whitespace characters with empty string
	        return str.replaceAll("\\s+", "");
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "Hello,   World!";
	        String str2 = "  Java   Programming  ";
	        String str3 = "";
	        String str4 = null;
	        String str5 = "NoWhitespace";
	        String str6 = "Tabs\tand\nnewlines";
	        
	        // Check and display results
	        System.out.println("Original: \"" + str1 + "\" -> Without Whitespace: \"" + removeWhitespace(str1) + "\"");
	        System.out.println("Original: \"" + str2 + "\" -> Without Whitespace: \"" + removeWhitespace(str2) + "\"");
	        System.out.println("Original: \"" + str3 + "\" -> Without Whitespace: \"" + removeWhitespace(str3) + "\"");
	        System.out.println("Original: null -> Without Whitespace: \"" + removeWhitespace(str4) + "\"");
	        System.out.println("Original: \"" + str5 + "\" -> Without Whitespace: \"" + removeWhitespace(str5) + "\"");
	        System.out.println("Original: \"" + str6 + "\" -> Without Whitespace: \"" + removeWhitespace(str6) + "\"");
	    }
	}
