package tests; // Updated package name to match the file path

import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // Added logger

    public void finiteLoop() { // Renamed method to reflect the corrected behavior
        int counter = 0; // Added a counter to control the loop
        while (counter < 10) { // Added an end condition to the loop
            LOGGER.info(String.format("Looping... iteration: %d", counter)); // Replaced System.out with logger and used built-in formatting
            counter++;
        }
    }

    public void riskyAccess(String str) {
        if (str != null) { // Added null check to avoid NullPointerException
            LOGGER.info(String.format("String length: %d", str.length())); // Replaced System.out with logger and used built-in formatting
        } else {
            LOGGER.warning("Provided string is null."); // Added warning for null input
        }
    }
}
