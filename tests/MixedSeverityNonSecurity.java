package wrongPackage;

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
        if (str == null) {
            LOGGER.warning("Received null string");
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
private static final java.util.logging.Logger LOGGER =
        java.util.logging.Logger.getLogger(MixedSeverityNonSecurity.class.getName());

public void nestedLoops(int n) {
    for (int i = 0; i < n; i++) { // code smell: nested loops
        for (int j = 0; j < n; j++) {
            int sum = i + j;
            if (sum % 2 == 0) {
                LOGGER.info("Even sum: " + sum);
            } else {
                LOGGER.info("Odd sum: " + sum);
            }
        }
    }
}
    // Redundant conditional (code smell)
    public void redundantCheck(int num) {
        if (num > 0) {
            LOGGER.info("Number is positive");
        }
    }
}
