// Corrected package name to match the file path and naming conventions
package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedSeverityNonSecurity {

    // Logger instance to replace System.out
    private static final Logger logger = LoggerFactory.getLogger(MixedSeverityNonSecurity.class);

    // Fixed infinite loop by adding an end condition
    public void finiteLoop() {
        int counter = 0; // Added a counter to control the loop
        while (counter < 10) { // End condition to prevent infinite loop
            String msg = "Looping... iteration: " + counter;
            logger.info(msg); // Replaced System.out with logger
            counter++; // Increment counter to eventually exit the loop
        }
    }

    // Fixed risky access by adding null check
    public void safeAccess(String str) {
        if (str != null) { // Added null check to prevent NullPointerException
            int length = str.length();
            logger.info("String length: {}", length); // Replaced System.out with logger
        } else {
            logger.warn("Provided string is null"); // Log a warning if str is null
        }
    }

    // Simplified cognitive complexity in the function
    public int simplifiedFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3; // Combined nested if-else into a single line
        } else if (x < -10) {
            result -= 10;
        } else if (x < -5) {
            result -= 5;
        } else {
            result -= 1;
        }
        return result;
    }

    // Refactored nested loops to reduce cognitive complexity
    public void processSums(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sumType = ((i + j) % 2 == 0) ? "Even" : "Odd";
                logger.info("{} sum: {}", sumType, (i + j)); // Replaced System.out with logger
            }
        }
    }

    // Merged redundant conditional statements
    public void checkNumber(int num) {
        if (num > 0) { // Removed redundant nested condition
            logger.info("Number is positive"); // Replaced System.out with logger
        }
    }
}
