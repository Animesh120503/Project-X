import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    public void infiniteLoop() {
        // Fix for Blocker issue (java:S2189): Add an end condition to the loop
        int counter = 0; // Example condition variable
        while (counter < 10) { // Add a proper end condition
            LOGGER.info("Looping... iteration: " + counter);
            counter++;
        }
    }

    public void riskyAccess(String str) {
        // Fix for Major issue (java:S106): Replace System.out with a logger
        if (str != null) {
            LOGGER.info("String length: " + str.length());
        } else {
            LOGGER.warning("Provided string is null.");
        }
    }
}