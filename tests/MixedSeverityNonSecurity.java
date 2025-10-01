package tests; // MAJOR: Added a named package to resolve java:S1220

import java.util.logging.Logger; // Importing Logger for proper logging

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // MAJOR: Replacing System.out with Logger (java:S106)

    // BLOCKER: Fixed infinite loop by adding an end condition (java:S2189)
    public void infiniteLoop() {
        int counter = 0; // Added a counter to break the loop
        while (counter < 10) { // End condition to prevent infinite loop
            LOGGER.info("Looping... " + counter);
            counter++;
        }
    }

    // CRITICAL: Fixed null dereference by adding a null check (java:S2259)
    public void riskyAccess(String str) {
        if (str != null) { // Added null check
            LOGGER.info("String length: " + str.length());
        } else {
            LOGGER.warning("String is null, cannot access length.");
        }
    }

    // MAJOR: High cognitive complexity reduced (java:S3776)
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

    public static void main(String[] args) {
        MixedSeverityNonSecurity test = new MixedSeverityNonSecurity();
        test.infiniteLoop();
        test.riskyAccess(null);
        LOGGER.info("Complex function result: " + test.complexFunction(7));
    }
}
