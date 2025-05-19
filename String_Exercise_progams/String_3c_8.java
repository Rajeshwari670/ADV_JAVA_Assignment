/* Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()  */


package ADV_JAVA;

public class String_3c_8 {
	    // User-defined function to check if a string contains only numeric characters
	    public static boolean isNumeric(String str) {
	        // Check for null or empty string
	        if (str == null || str.isEmpty()) {
	            return false;
	        }
	        
	        // Check each character to ensure it's a digit
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "12345";
	        String str2 = "123abc";
	        String str3 = "";
	        String str4 = null;
	        String str5 = "9876543210";
	        String str6 = "12 34";
	        
	        // Check and display results
	        System.out.println("String: \"" + str1 + "\" -> isNumeric: " + isNumeric(str1));
	        System.out.println("String: \"" + str2 + "\" -> isNumeric: " + isNumeric(str2));
	        System.out.println("String: \"" + str3 + "\" -> isNumeric: " + isNumeric(str3));
	        System.out.println("String: null -> isNumeric: " + isNumeric(str4));
	        System.out.println("String: \"" + str5 + "\" -> isNumeric: " + isNumeric(str5));
	        System.out.println("String: \"" + str6 + "\" -> isNumeric: " + isNumeric(str6));
	    }
	

}
