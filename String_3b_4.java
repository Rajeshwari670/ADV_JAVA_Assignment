/* Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome(): */


package ADV_JAVA;

public class String_3b_4 {
	    // User-defined function to check if a string is a palindrome (ignoring case and punctuation)
	    public static boolean isPalindrome(String str) {
	        // Check for null or empty string
	        if (str == null || str.isEmpty()) {
	            return true; // Consider null or empty as palindrome
	        }
	        
	        // Convert to lowercase and remove punctuation
	        String cleanStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
	        
	        // Compare characters from start and end
	        int left = 0;
	        int right = cleanStr.length() - 1;
	        
	        while (left < right) {
	            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "A man, a plan, a canal: Panama";
	        String str2 = "race a car";
	        String str3 = "Was it a car or a cat I saw?";
	        String str4 = "";
	        String str5 = null;
	        String str6 = "Hello";
	        
	        // Check and display results
	        System.out.println("String: \"" + str1 + "\" -> isPalindrome: " + isPalindrome(str1));
	        System.out.println("String: \"" + str2 + "\" -> isPalindrome: " + isPalindrome(str2));
	        System.out.println("String: \"" + str3 + "\" -> isPalindrome: " + isPalindrome(str3));
	        System.out.println("String: \"" + str4 + "\" -> isPalindrome: " + isPalindrome(str4));
	        System.out.println("String: null -> isPalindrome: " + isPalindrome(str5));
	        System.out.println("String: \"" + str6 + "\" -> isPalindrome: " + isPalindrome(str6));
	    }
	}


