package tests; // Fixed package name to match the file path

import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger logger = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // Added logger

    // Fixed infinite loop by adding an end condition
    public void finiteLoop() {
        int counter = 0; // Added a counter to limit the loop
        while (counter < 10) { // End condition added
            String msg = "Looping...";
            logger.info(msg); // Replaced System.out with logger
            counter++; // Increment counter
        }
    }

    // Fixed risky access by adding null check
    public void safeAccess(String str) {
        if (str != null) { // Added null check
            int length = str.length();
            logger.info("String length: " + length); // Replaced System.out with logger
        } else {
            logger.warning("String is null"); // Added warning for null case
        }
    }

    // Simplified cognitive complexity by merging nested if statements
    public int simplifiedFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3; // Merged nested if statements
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
    public void singleLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sumType = ((i + j) % 2 == 0) ? "Even sum: " : "Odd sum: ";
                logger.info(sumType + (i + j)); // Replaced System.out with logger
            }
        }
    }

    // Fixed redundant conditional by merging conditions
    public void simplifiedCheck(int num) {
        if (num > 0) {
            logger.info("Number is positive"); // Replaced System.out with logger
        }
    }
}
