/* 2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith() */

package ADV_JAVA;
import java.util.Arrays;


public class Stringoperation_2a {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        System.out.println("1. String Creation and Basic Operations:");
	        String str1 = "Hello, World!";
	        String str2 = new String("Java Programming");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);
	        
	        // 2. Length and Character Access
	        System.out.println("\n2. Length and Character Access:");
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 7 in str1: " + str1.charAt(7)); // W
	        char[] charArray = str1.toCharArray();
	        System.out.println("Character array of str1: " + Arrays.toString(charArray));
	        
	        // 3. String Comparison
	        System.out.println("\n3. String Comparison:");
	        String str3 = "Hello, World!";
	        String str4 = "hello, world!";
	        System.out.println("str1 equals str3: " + str1.equals(str3)); // true
	        System.out.println("str1 equals str4 (case-sensitive): " + str1.equals(str4)); // false
	        System.out.println("str1 equals str4 (ignore case): " + str1.equalsIgnoreCase(str4)); // true
	        System.out.println("Compare str1 to str2: " + str1.compareTo(str2)); // negative
	        
	        // 4. String Searching
	        System.out.println("\n4. String Searching:");
	        System.out.println("Index of 'World' in str1: " + str1.indexOf("World")); // 7
	        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l')); // 10
	        System.out.println("str1 contains 'Java': " + str1.contains("Java")); // false
	        
	        // 5. Substring Operations
	        System.out.println("\n5. Substring Operations:");
	        System.out.println("Substring from index 7: " + str1.substring(7)); // World!
	        System.out.println("Substring from index 0 to 5: " + str1.substring(0, 5)); // Hello
	        
	        // 6. String Modification
	        System.out.println("\n6. String Modification:");
	        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));
	        System.out.println("To uppercase: " + str1.toUpperCase());
	        System.out.println("To lowercase: " + str1.toLowerCase());
	        
	        // 7. Whitespace Handling
	        System.out.println("\n7. Whitespace Handling:");
	        String str5 = "   Spaces   Around   ";
	        System.out.println("Original str5: '" + str5 + "'");
	        System.out.println("Trimmed str5: '" + str5.trim() + "'");
	        System.out.println("Strip leading: '" + str5.stripLeading() + "'");
	        System.out.println("Strip trailing: '" + str5.stripTrailing() + "'");
	        
	        // 8. String Concatenation
	        System.out.println("\n8. String Concatenation:");
	        String str6 = "Learning ";
	        String str7 = "Java";
	        System.out.println("Concat using +: " + str6 + str7);
	        System.out.println("Concat using concat(): " + str6.concat(str7));
	        
	        // 9. String Splitting
	        System.out.println("\n9. String Splitting:");
	        String str8 = "Red,Blue,Green,Yellow";
	        String[] colors = str8.split(",");
	        System.out.println("Split str8: " + Arrays.toString(colors));
	        
	        // 10. StringBuilder Demo
	        System.out.println("\n10. StringBuilder Demo:");
	        StringBuilder sb = new StringBuilder("Initial");
	        sb.append(" Text");
	        sb.insert(7, "Modified ");
	        sb.delete(0, 7);
	        System.out.println("StringBuilder result: " + sb.toString());
	        System.out.println("Reverse StringBuilder: " + sb.reverse().toString());
	        
	        // 11. String Formatting
	        System.out.println("\n11. String Formatting:");
	        String name = "Alice";
	        int age = 25;
	        double gpa = 3.75;
	        System.out.printf("Name: %s, Age: %d, GPA: %.2f%n", name, age, gpa);
	        String formatted = String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
	        System.out.println("Using String.format: " + formatted);
	        
	        // 12. Validate Email with contains(), startsWith(), and endsWith()
	        System.out.println("\n12. Email Validation:");
	        String email = "user@example.com";
	        boolean isValidEmail = email.contains("@") &&
	                              !email.startsWith("@") &&
	                              email.endsWith(".com") &&
	                              email.indexOf("@") == email.lastIndexOf("@");
	        System.out.println("Email: " + email);
	        System.out.println("Is valid email: " + isValidEmail);
	        
	        // Test invalid email
	        String invalidEmail = "@invalid.email";
	        boolean isInvalidEmail = invalidEmail.contains("@") &&
	                                !invalidEmail.startsWith("@") &&
	                                invalidEmail.endsWith(".com") &&
	                                invalidEmail.indexOf("@") == invalidEmail.lastIndexOf("@");
	        System.out.println("Invalid Email: " + invalidEmail);
	        System.out.println("Is valid email: " + isInvalidEmail);
	    }
	}


