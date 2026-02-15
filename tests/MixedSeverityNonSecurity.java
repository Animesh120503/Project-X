package wrongPackage;

public class MixedSeverityNonSecurity {

    // Infinite loop (bug / code smell)
    public void infiniteLoop() {
        int i = 0;
while (i < 10) {
    String msg = "Looping forever...";
    java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName()).info(msg);
    i++;
}    }

    // Risky access (bug)
    public void riskyAccess(String str) {
        int length = str.length(); // will throw NullPointerException if str is null
        java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName()).info("String length: " + length);
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
        final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
        for (int i = 0; i < n; i++) { // code smell: nested loops
for (int j = 0; j < n; j++) {
    int sum = i + j;
    if (sum % 2 == 0) {
        logger.log(java.util.logging.Level.INFO, "Even sum: {0}", sum);
    } else {
        logger.log(java.util.logging.Level.INFO, "Odd sum: {0}", sum);
    }
}        }
    }

    // Redundant conditional (code smell)
    public void redundantCheck(int num) {
        if (num > 0) {
            final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());
            logger.info("Number is positive");
        }
    }
}
