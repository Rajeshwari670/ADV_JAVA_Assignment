/* Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()  */


package ADV_JAVA;
import java.util.Random;

public class String_3c_9 {
	    // User-defined function to generate a random string of specified length
	    public static String generateRandomString(int length) {
	        // Check for invalid length
	        if (length < 0) {
	            return "";
	        }
	        
	        // Define the character set (alphanumeric)
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder randomString = new StringBuilder(length);
	        
	        // Generate random characters
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            randomString.append(characters.charAt(index));
	        }
	        
	        return randomString.toString();
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        int length1 = 5;
	        int length2 = 10;
	        int length3 = 0;
	        int length4 = -1;
	        int length5 = 15;
	        
	        // Generate and display random strings
	        System.out.println("Random string of length " + length1 + ": " + generateRandomString(length1));
	        System.out.println("Random string of length " + length2 + ": " + generateRandomString(length2));
	        System.out.println("Random string of length " + length3 + ": " + generateRandomString(length3));
	        System.out.println("Random string of length " + length4 + ": " + generateRandomString(length4));
	        System.out.println("Random string of length " + length5 + ": " + generateRandomString(length5));
	    }
	

}
