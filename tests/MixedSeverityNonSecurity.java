package tests;

public class MixedSeverityNonSecurity {

    // Infinite loop (bug / code smell)
    public void infiniteLoop() {
int i = 0;
while (i < 10) {
    String msg = "Looping forever...";
    LOGGER.info(msg); // replaced System.out with logger
    i++;
}    }

    // Risky access (bug)
    public void riskyAccess(String str) {
        int length = str.length(); // will throw NullPointerException if str is null
        LOGGER.log(java.util.logging.Level.INFO, "String length: {0}", length);
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
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
    public void nestedLoops(int n) {
        for (int i = 0; i < n; i++) { // code smell: nested loops
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    LOGGER.log(java.util.logging.Level.INFO, "Even sum: {0}", i + j);
                } else {
                    LOGGER.log(java.util.logging.Level.INFO, "Odd sum: {0}", i + j);
                }
            }
        }
    }

    // Redundant conditional (code smell)
    public void redundantCheck(int num) {
        if (num > 0) {
            LOGGER.log(java.util.logging.Level.INFO, "Number is positive"); // code smell: redundant condition
        }
    }
}
