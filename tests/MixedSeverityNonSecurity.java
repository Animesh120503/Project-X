package tests;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    // Logger instance to replace System.out.println
    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    public void infiniteLoop() {
        // Added an end condition to the loop to prevent infinite execution
        int counter = 0;
        while (counter < 10) { // Example end condition: loop runs 10 times
            String msg = "Looping... iteration " + counter;
            LOGGER.log(Level.INFO, msg);
            counter++;
        }
    }

    public void riskyAccess(String str) {
        // Added null check to avoid NullPointerException
        if (str != null) {
            int length = str.length();
            LOGGER.log(Level.INFO, "String length: {0}", length);
        } else {
            LOGGER.log(Level.WARNING, "Input string is null.");
        }
    }

    // Removed unused private field 'AWS_SECRET_KEY'
    private static final String DB_PASSWORD = "PASSWORD_TEST_ONLY";

    private static final String AWS_ACCESS_KEY = "AKIA_TEST_ACCESS_KEY_123456";

    public void connectToDb() {
        // Removed sensitive information from logs
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?user=root&password=******";
        LOGGER.log(Level.INFO, "Connecting to the database...");
    }

    public void callExternalApi() {
        // Removed sensitive information from logs
        String endpoint = "https://api.example.com/data";
        LOGGER.log(Level.INFO, "Calling external API at {0}", endpoint);
    }
}
