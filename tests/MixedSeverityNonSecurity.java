// This Java file is intentionally crafted to trigger different severities (non-security)

public class MixedSeverityNonSecurity {

    // 🔴 BLOCKER: Infinite loop (Rule: java:S2189)
    public void infiniteLoop() {
        int counter = 0; // Add a counter to break the loop
        while (counter < 10) { // Add an end condition
            LOGGER.info("Looping... " + counter);
            counter++;
        }
    }

    // 🟠 CRITICAL: Null dereference (Rule: java:S2259)
    public void riskyAccess(String str) {
        // Attempt to call method on possibly null object
        if (str != null) { // Add null check
            LOGGER.info("String length: " + str.length());
        } else {
            LOGGER.warning("String is null, cannot access length.");
        }
    }

    // 🟡 MAJOR: High cognitive complexity (Rule: java:S3776)
    public int complexFunction(int x) {
        int result = 0;
        if (x > 0) {
            result += (x % 2 == 0) ? 2 : 3; // Simplify nested conditions
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
