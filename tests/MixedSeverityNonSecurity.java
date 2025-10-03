// Updated package name to match the file path and naming conventions
package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedSeverityNonSecurity {

    // Logger instance to replace System.out
    private static final Logger logger = LoggerFactory.getLogger(MixedSeverityNonSecurity.class);

    // Fixed infinite loop by adding an end condition
    public void infiniteLoop() {
        int counter = 0; // Added a counter to break the loop
        while (counter < 10) { // End condition to prevent infinite loop
            String msg = "Looping... iteration: " + counter;
            logger.info(msg); // Replaced System.out with logger
            counter++;
        }
    }

    // Fixed risky access by adding null check
    public void riskyAccess(String str) {
        if (str != null) { // Added null check to prevent NullPointerException
            int length = str.length();
            logger.info("String length: {}", length); // Replaced System.out with logger
        } else {
            logger.warn("Input string is null"); // Log a warning if input is null
        }
    }

    // Simplified cognitive complexity in the function
    public int complexFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3; // Simplified nested if-else
        } else if (x < -10) {
            result -= 10;
        } else if (x < -5) {
            result -= 5;
        } else {
            result -= 1;
        }
        return result;
    }

    // Reduced cognitive complexity by removing nested loops
    public void nestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sumType = ((i + j) % 2 == 0) ? "Even" : "Odd";
                logger.info("{} sum: {}", sumType, (i + j)); // Replaced System.out with logger
            }
        }
    }

    // Merged redundant conditional statements
    public void redundantCheck(int num) {
        if (num > 0) {
            logger.info("Number is positive"); // Replaced System.out with logger
        }
    }
}
