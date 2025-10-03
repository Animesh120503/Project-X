package tests;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    // Logger instance to replace System.out
    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    // Fixed infinite loop by adding an end condition
    public void infiniteLoop() {
        int counter = 0; // Added a counter to break the loop
        while (counter < 10) { // End condition to prevent infinite loop
            String msg = "Looping... iteration: " + counter;
            LOGGER.log(Level.INFO, msg); // Replaced System.out with logger
            counter++;
        }
    }

    // Added null check to prevent NullPointerException
    public void riskyAccess(String str) {
        if (str != null) { // Null check added
            int length = str.length();
            LOGGER.log(Level.INFO, "String length: {0}", length); // Replaced System.out with logger
        } else {
            LOGGER.log(Level.WARNING, "Input string is null"); // Log warning for null input
        }
    }

    // Simplified nested if statements to reduce cognitive complexity
    public int complexFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3; // Merged nested if-else into a single line
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
    public void nestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String message = ((i + j) % 2 == 0) ? "Even sum: " + (i + j) : "Odd sum: " + (i + j);
                LOGGER.log(Level.INFO, message); // Replaced System.out with logger
            }
        }
    }

    // Merged redundant conditional statements
    public void redundantCheck(int num) {
        if (num > 0) {
            LOGGER.log(Level.INFO, "Number is positive"); // Replaced System.out with logger
        }
    }
}
