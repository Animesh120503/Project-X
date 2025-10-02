package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedSeverityNonSecurity {

    // Logger instance for logging messages
    private static final Logger logger = LoggerFactory.getLogger(MixedSeverityNonSecurity.class);

    public void infiniteLoop() {
        // Adding an end condition to the loop to resolve the BLOCKER issue
        int counter = 0;
        while (counter < 10) { // Example end condition: loop runs 10 times
            String msg = "Looping iteration: " + counter;
            logger.info(msg); // Replacing System.out with logger
            counter++;
        }
    }

    public void riskyAccess(String str) {
        // Replacing System.out with logger
        int length = str.length();
        logger.info("String length: {}", length);
    }

    private static final String DB_PASSWORD = "PASSWORD_TEST_ONLY";

    private static final String AWS_ACCESS_KEY = "AKIA_TEST_ACCESS_KEY_123456";
    // Removed unused AWS_SECRET_KEY field to resolve the MAJOR issue
    // private static final String AWS_SECRET_KEY = "SECRET_TEST_KEY_ABCDEF";

    public void connectToDb() {
        // Replacing System.out with logger
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?user=root&password=" + DB_PASSWORD;
        logger.info("Connecting with URL: {}", jdbcUrl);
    }

    public void callExternalApi() {
        // Replacing System.out with logger
        String endpoint = "https://api.example.com/data";
        String apiKey = AWS_ACCESS_KEY;
        logger.info("Calling {} with key: {}", endpoint, apiKey);
    }
}
