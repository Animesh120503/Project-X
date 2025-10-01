import java.util.logging.Logger;

public class MixedSeverityNonSecurity {

    private static final Logger logger = Logger.getLogger(MixedSeverityNonSecurity.class.getName());

    // 🔴 BLOCKER: Infinite loop (Rule: java:S2189)
    public void infiniteLoop() {
        int counter = 0; // Add a counter to break the loop
        while (counter < 10) { // End condition added
            logger.info("Looping... " + counter);
            counter++;
        }
    }

    // 🟠 CRITICAL: Null dereference (Rule: java:S2259)
    public void riskyAccess(String str) {
        if (str != null) { // Null check added
            System.out.println(str.length());
        } else {
            logger.warning("Attempted to access length of a null string.");
        }
    }

    // 🟡 MAJOR: High cognitive complexity (Rule: java:S3776)
    public int complexFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3; // Simplified nested conditions
        } else if (x < -10) {
            result -= 10;
        } else if (x < -5) {
            result -= 5;
        } else {
            result -= 1;
        }
        return result;
    }

    // Main method to illustrate usage (Sonar will analyze code without needing to run)
    public static void main(String[] args) {
        MixedSeverityNonSecurity test = new MixedSeverityNonSecurity();
        // ⚠️ Do not call infiniteLoop(), or program will hang
        // test.infiniteLoop();
        test.riskyAccess(null); // Will throw at runtime
        System.out.println(test.complexFunction(7));
    }
}
