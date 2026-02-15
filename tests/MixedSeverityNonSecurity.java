package tests;

public class MixedSeverityNonSecurity {

    // Infinite loop (bug / code smell)
public void infiniteLoop() {
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
    for (int i = 0; i < 10; i++) {
        String msg = "Looping... (iteration " + i + ")";
        logger.info(msg);
    }
}
    // Risky access (bug)
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
    
    public void riskyAccess(String str) {
        if (str == null) {
            LOGGER.info("String is null");
            return;
        }
        int length = str.length();
        LOGGER.info("String length: " + length);
    }

    // Cognitive complexity example
    public int complexFunction(int x) {
        int result = 0;
        if (x > 0) {
            if (x % 2 == 0) {
                result += 2;
            } else {
                result += 3;
            }
        } else {
            if (x < -10) {
                result -= 10;
            } else if (x < -5) {
                result -= 5;
            } else {
                result -= 1;
            }
        }
        return result;
    }

    // Nested loops for cognitive complexity
public void nestedLoops(int n) {
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
    for (int i = 0; i < n; i++) { // code smell: nested loops
        for (int j = 0; j < n; j++) {
            if ((i + j) % 2 == 0) {
                logger.info("Even sum: " + (i + j));
            } else {
                logger.info("Odd sum: " + (i + j));
            }
        }
    }
}
    // Redundant conditional (code smell)
public void redundantCheck(int num) {
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
    if (num > 0) {
        logger.info("Number is positive");
    }
}}
