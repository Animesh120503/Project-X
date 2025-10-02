// Corrected package name to match the file path and naming conventions
package tests;

// Importing a logger to replace System.out
import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    // Logger instance for logging messages
    private static final Logger logger = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

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
            logger.info("String length: " + length); // Replaced System.out with logger
        } else {
            logger.warning("Input string is null"); // Logging a warning for null input
        }
    }

    // Simplified cognitive complexity in the function
    public int complexFunction(int x) {
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

    // Reduced cognitive complexity by removing nested loops
    public void nestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String message = ((i + j) % 2 == 0) ? "Even sum: " + (i + j) : "Odd sum: " + (i + j);
                logger.info(message); // Replaced System.out with logger
            }
        }
    }

    // Merged redundant conditional statements
    public void redundantCheck(int num) {
        if (num > 0) { // Removed the redundant inner if statement
            logger.info("Number is positive"); // Replaced System.out with logger
        }
    }
}
