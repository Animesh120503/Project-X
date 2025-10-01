package com.example; // Added a named package to resolve the issue of the file not being in a named package.

import java.util.logging.Logger; // Importing the Logger class.

public class MixedSeverityNonSecurity {

    private static final Logger LOGGER = Logger.getLogger(MixedSeverityNonSecurity.class.getName()); // Replacing System.out with a logger.

    public void infiniteLoop() {
        while (true) {
            LOGGER.info("Looping forever..."); // Replaced System.out.println with LOGGER.info.
        }
    }

    public void riskyAccess(String str) {
        LOGGER.info("String length: " + str.length()); // Replaced System.out.println with LOGGER.info.
    }
}
