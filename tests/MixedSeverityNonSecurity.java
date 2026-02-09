package tests;

// Importing a logging framework to replace System.out.println
import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    // Logger instance for logging messages
    private static final Logger logger = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    // Fixed infinite loop by adding an end condition
    public void finiteLoop() {
        int counter = 0; // Added a counter to control the loop
        while (counter < 10) { // End condition: loop will run 10 times
            String msg = "Looping... iteration: " + counter;
            logger.info(msg); // Replaced System.out.println with logger
            counter++;
        }
    }

    // Fixed risky access by adding a null check for the input string
    public void safeAccess(String str) {
        if (str != null) { // Added null check to prevent NullPointerException
            int length = str.length();
            logger.info("String length: " + length); // Replaced System.out.println with logger
        } else {
            logger.warning("Input string is null"); // Logging a warning for null input
        }
    }

    // Simplified cognitive complexity by merging nested conditions
    public int simplifiedFunction(int x) {
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

    // Reduced cognitive complexity by avoiding nested loops
    public void simplifiedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String message = ((i + j) % 2 == 0) ? "Even sum: " : "Odd sum: ";
                logger.info(message + (i + j)); // Replaced System.out.println with logger
            }
        }
    }

    // Merged redundant conditional statements
    public void mergedCheck(int num) {
        if (num > 0) {
            logger.info("Number is positive"); // Replaced System.out.println with logger
        }
    }
}
