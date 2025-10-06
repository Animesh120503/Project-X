package tests;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    // Logger instance to replace System.out
    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    // Fixed infinite loop by adding an end condition
    public void finiteLoop() {
        int counter = 0; // Added a counter to control the loop
        while (counter < 10) { // End condition to prevent infinite loop
            String msg = "Looping... iteration: " + counter;
            LOGGER.log(Level.INFO, msg); // Replaced System.out with logger
            counter++;
        }
    }

    // Fixed risky access by adding null check
    public void safeAccess(String str) {
        if (str != null) { // Added null check to prevent NullPointerException
            int length = str.length();
            LOGGER.log(Level.INFO, "String length: {0}", length); // Replaced System.out with logger
        } else {
            LOGGER.log(Level.WARNING, "Input string is null"); // Log a warning if input is null
        }
    }

    // Simplified cognitive complexity in the function
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
    public void processSums(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sumType = ((i + j) % 2 == 0) ? "Even" : "Odd";
                LOGGER.log(Level.INFO, "{0} sum: {1}", new Object[]{sumType, (i + j)}); // Replaced System.out with logger
            }
        }
    }

    // Removed redundant conditional
    public void checkNumber(int num) {
        if (num > 0) { // Removed the redundant inner condition
            LOGGER.log(Level.INFO, "Number is positive"); // Replaced System.out with logger
        }
    }
}
