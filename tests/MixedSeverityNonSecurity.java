package tests; // Fixed package name to match the file path

import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // Added logger

    public void infiniteLoop() {
        // Fixed infinite loop by adding an end condition
        int counter = 0;
        while (counter < 100) { // Example end condition
            String msg = "Looping...";
            LOGGER.info(msg); // Replaced System.out with logger
            counter++;
        }
    }

    public void riskyAccess(String str) {
        int length = str.length();
        LOGGER.info("String length: " + length); // Replaced System.out with logger
    }

    private static final String DB_PASSWORD = "PASSWORD_TEST_ONLY";

    private static final String AWS_ACCESS_KEY = "AKIA_TEST_ACCESS_KEY_123456";
    // Removed unused private field AWS_SECRET_KEY
    // private static final String AWS_SECRET_KEY = "SECRET_TEST_KEY_ABCDEF";

    public void connectToDb() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?user=root&password=" + DB_PASSWORD;
        LOGGER.info("Connecting with URL: " + jdbcUrl); // Replaced System.out with logger
    }

    public void callExternalApi() {
        String endpoint = "https://api.example.com/data";
        String apiKey = AWS_ACCESS_KEY;
        LOGGER.info("Calling " + endpoint + " with key: " + apiKey); // Replaced System.out with logger
    }
}
