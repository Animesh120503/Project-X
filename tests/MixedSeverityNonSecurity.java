package tests; // Corrected package name to match file path

import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    // Fixed infinite loop by adding an end condition
    public void finiteLoop(int maxIterations) {
        int count = 0;
        while (count < maxIterations) {
            String msg = "Looping...";
            LOGGER.info(msg); // Replaced System.out with logger
            count++;
        }
    }

    // Fixed risky access by adding null check
    public void safeAccess(String str) {
        if (str != null) {
            int length = str.length();
            LOGGER.info("String length: " + length); // Replaced System.out with logger
        } else {
            LOGGER.warning("String is null"); // Added warning for null case
        }
    }

    // Simplified cognitive complexity in complexFunction
    public int simplifiedFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3;
        } else if (x < -10) {
            result -= 10;
        } else if (x < -5) {
            result -= 5;
        } else {
            result -= 1;
        }
        return result;
    }

    // Reduced cognitive complexity in nestedLoops
    public void simplifiedNestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String message = ((i + j) % 2 == 0) ? "Even sum: " + (i + j) : "Odd sum: " + (i + j);
                LOGGER.info(message); // Replaced System.out with logger
            }
        }
    }

    // Merged redundant conditional
    public void checkPositive(int num) {
        if (num > 0) {
            LOGGER.info("Number is positive"); // Replaced System.out with logger
        }
    }
}
