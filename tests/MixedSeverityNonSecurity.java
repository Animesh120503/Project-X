package correctPackageName; // Fixed package name to match the file path

import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger logger = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // Added logger

    // Fixed infinite loop by adding an end condition
    public void infiniteLoop() {
        int counter = 0; // Example end condition
        while (counter < 10) { // Loop will terminate after 10 iterations
            String msg = "Looping... iteration " + counter;
            logger.info(msg); // Replaced System.out with logger
            counter++;
        }
    }

    // Fixed risky access by adding null check
    public void riskyAccess(String str) {
        if (str != null) { // Added null check
            int length = str.length();
            logger.info("String length: " + length); // Replaced System.out with logger
        } else {
            logger.warning("String is null"); // Added warning for null case
        }
    }

    // Simplified cognitive complexity in complexFunction
    public int complexFunction(int x) {
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

    // Reduced cognitive complexity in nestedLoops
    public void nestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sumType = ((i + j) % 2 == 0) ? "Even sum: " : "Odd sum: ";
                logger.info(sumType + (i + j)); // Replaced System.out with logger
            }
        }
    }

    // Fixed redundant conditional
    public void redundantCheck(int num) {
        if (num > 0) {
            logger.info("Number is positive"); // Removed redundant condition and replaced System.out with logger
        }
    }
}
