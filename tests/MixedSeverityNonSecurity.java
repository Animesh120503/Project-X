package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedSeverityNonSecurity {

    private static final Logger logger = LoggerFactory.getLogger(MixedSeverityNonSecurity.class);

    public void infiniteLoop() {
        while (true) {
            String msg = "Looping forever...";
            logger.info(msg); // Replace System.out.println with logger
            break; // Add an end condition to the loop
        }
    }

    public void riskyAccess(String str) {
        int length = str.length();
        logger.info("String length: {}", length); // Replace System.out.println with logger
    }

    private static final String DB_PASSWORD = "PASSWORD_TEST_ONLY";

    private static final String AWS_ACCESS_KEY = "AKIA_TEST_ACCESS_KEY_123456";
    // Removed unused private field AWS_SECRET_KEY
    // private static final String AWS_SECRET_KEY = "SECRET_TEST_KEY_ABCDEF";

    public void connectToDb() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?user=root&password=" + DB_PASSWORD;
        logger.info("Connecting with URL: {}", jdbcUrl); // Replace System.out.println with logger
    }

    public void callExternalApi() {
        String endpoint = "https://api.example.com/data";
        String apiKey = AWS_ACCESS_KEY;
        logger.info("Calling {} with key: {}", endpoint, apiKey); // Replace System.out.println with logger
    }

    public void storeCredentialInFile() {
        String configValue = "password=PASSWORD_TEST_ONLY";
        logger.info("Writing config: {}", configValue); // Replace System.out.println with logger
    }
}
