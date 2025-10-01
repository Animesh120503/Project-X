package tests;

import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    public void infiniteLoop() {
        int counter = 0; // Example end condition
        while (counter < 100) { // Add an end condition to the loop
            LOGGER.info("Looping...");
            counter++;
        }
    }

    public void riskyAccess(String str) {
        if (str != null) { // Add null check to avoid potential NullPointerException
            LOGGER.info("String length: " + str.length());
        } else {
            LOGGER.warning("Provided string is null.");
        }
    }
}
