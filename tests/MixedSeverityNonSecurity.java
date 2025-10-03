package com.example.projectx; // Updated package name to follow the naming convention

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedSeverityNonSecurity {

    // Logger instance to replace System.out
    private static final Logger logger = LoggerFactory.getLogger(MixedSeverityNonSecurity.class);

    // Fixed infinite loop by adding an end condition
    public void finiteLoop(int maxIterations) {
        int count = 0;
        while (count < maxIterations) {
            String msg = "Looping... iteration: " + count;
            logger.info(msg); // Replaced System.out with logger
            count++;
        }
    }

    // Fixed risky access by adding null check
    public void safeAccess(String str) {
        if (str != null) {
            int length = str.length();
            logger.info("String length: {}", length); // Replaced System.out with logger
        } else {
            logger.warn("Provided string is null");
        }
    }

    // Simplified complexFunction to reduce cognitive complexity
    public int simplifiedFunction(int x) {
        if (x > 0) {
            return x % 2 == 0 ? 2 : 3;
        } else if (x < -10) {
            return -10;
        } else if (x < -5) {
            return -5;
        } else {
            return -1;
        }
    }

    // Refactored nested loops to reduce cognitive complexity
    public void processSums(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String sumType = (i + j) % 2 == 0 ? "Even" : "Odd";
                logger.info("{} sum: {}", sumType, (i + j)); // Replaced System.out with logger
            }
        }
    }

    // Removed redundant conditional
    public void checkNumber(int num) {
        if (num > 0) {
            logger.info("Number is positive"); // Replaced System.out with logger
        }
    }
}
