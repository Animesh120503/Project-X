package tests; // Added a named package to resolve the MINOR issue

import java.util.logging.Logger; // Importing Logger for proper logging

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // Logger instance

    public void infiniteLoop() {
        // Fix for BLOCKER issue: Add an end condition to the loop
        int counter = 0; // Example condition variable
        while (counter < 10) { // Adding a condition to prevent infinite looping
            LOGGER.info("Looping... " + counter); // Replaced System.out with Logger
            counter++;
        }
    }

    public void riskyAccess(String str) {
        // Fix for MAJOR issue: Replace System.out with Logger
        if (str != null) { // Adding a null check for safety
            LOGGER.info("String length: " + str.length());
        } else {
            LOGGER.warning("Provided string is null.");
        }
    }
}
