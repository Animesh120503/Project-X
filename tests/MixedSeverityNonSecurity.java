package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedSeverityNonSecurity {

    private static final Logger logger = LoggerFactory.getLogger(MixedSeverityNonSecurity.class);

    public void infiniteLoop() {
        // FIX: Add an end condition to the loop
        int counter = 0; // Example condition variable
        while (counter < 10) { // Example end condition
            String msg = "Looping...";
            logger.info(msg); // FIX: Replace System.out with logger
            counter++;
        }
    }

    public void riskyAccess(String str) {
        int length = str.length();
        logger.info("String length: {}", length); // FIX: Replace System.out with logger
    }

    private static final String DB_PASSWORD = "PASSWORD_TEST_ONLY";

    private static final String AWS_ACCESS_KEY = "AKIA_TEST_ACCESS_KEY_123456";
    // FIX: Remove unused private field
    // private static final String AWS_SECRET_KEY = "SECRET_TEST_KEY_ABCDEF";

    public void connectToDb() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?user=root&password=" + DB_PASSWORD;
        logger.info("Connecting with URL: {}", jdbcUrl); // FIX: Replace System.out with logger
    }

    public void callExternalApi() {
        String endpoint = "https://api.example.com/data";
        String apiKey = AWS_ACCESS_KEY;
        logger.info("Calling {} with key: {}", endpoint, apiKey); // FIX: Replace System.out with logger
    }
}
