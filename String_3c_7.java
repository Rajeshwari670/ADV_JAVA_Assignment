/* Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()  */


package ADV_JAVA;

public class String_3c_7 {
	    // User-defined function to truncate a string to a specified length and add ellipsis
	    public static String truncate(String str, int maxLength) {
	        // Check for null string or invalid maxLength
	        if (str == null) {
	            return null;
	        }
	        if (maxLength < 0) {
	            return str;
	        }
	        
	        // If maxLength is less than 3, return substring without ellipsis
	        if (maxLength <= 3) {
	            return str.length() <= maxLength ? str : str.substring(0, maxLength);
	        }
	        
	        // If string length is within maxLength, return as is
	        if (str.length() <= maxLength) {
	            return str;
	        }
	        
	        // Truncate to maxLength-3 to accommodate ellipsis and append "..."
	        return str.substring(0, maxLength - 3) + "...";
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "Hello, World!";
	        String str2 = "Java Programming";
	        String str3 = "";
	        String str4 = null;
	        String str5 = "Short";
	        String str6 = "Very long text that needs truncation";
	        
	        // Check and display results
	        System.out.println("Original: \"" + str1 + "\" (maxLength=10) -> Truncated: \"" + truncate(str1, 10) + "\"");
	        System.out.println("Original: \"" + str2 + "\" (maxLength=8) -> Truncated: \"" + truncate(str2, 8) + "\"");
	        System.out.println("Original: \"" + str3 + "\" (maxLength=5) -> Truncated: \"" + truncate(str3, 5) + "\"");
	        System.out.println("Original: null (maxLength=5) -> Truncated: \"" + truncate(str4, 5) + "\"");
	        System.out.println("Original: \"" + str5 + "\" (maxLength=10) -> Truncated: \"" + truncate(str5, 10) + "\"");
	        System.out.println("Original: \"" + str6 + "\" (maxLength=15) -> Truncated: \"" + truncate(str6, 15) + "\"");
	    }
	

}
