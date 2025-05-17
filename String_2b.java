/* 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better. */


package ADV_JAVA;

public class String_2b {
	    public static void main(String[] args) {
	        final int ITERATIONS = 10_000;
	        final String APPEND_TEXT = "AIET";
	        
	        // Test StringBuilder performance
	        long startTimeBuilder = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < ITERATIONS; i++) {
	            stringBuilder.append(APPEND_TEXT);
	        }
	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = (endTimeBuilder - startTimeBuilder) / 1_000_000; // Convert to milliseconds
	        
	        // Test StringBuffer performance
	        long startTimeBuffer = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < ITERATIONS; i++) {
	            stringBuffer.append(APPEND_TEXT);
	        }
	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = (endTimeBuffer - startTimeBuffer) / 1_000_000; // Convert to milliseconds
	        
	        // Display results
	        System.out.println("Performance Test Results (Appending 'AIET' " + ITERATIONS + " times):");
	        System.out.println("StringBuilder Time: " + durationBuilder + " ms");
	        System.out.println("StringBuffer Time: " + durationBuffer + " ms");
	        System.out.println("StringBuilder Length: " + stringBuilder.length());
	        System.out.println("StringBuffer Length: " + stringBuffer.length());
	        
	        // Compare performance
	        if (durationBuilder < durationBuffer) {
	            System.out.println("StringBuilder is faster by " + (durationBuffer - durationBuilder) + " ms");
	        } else {
	            System.out.println("StringBuffer is faster by " + (durationBuilder - durationBuffer) + " ms");
	        }
	    }
	}


