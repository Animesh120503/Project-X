// This Java file is intentionally crafted to trigger different severities (non-security)

public class MixedSeverityNonSecurity {

    // 🔴 BLOCKER: Infinite loop (Rule: java:S2189)
    public void infiniteLoop() {
        while (true) {
            System.out.println("Looping forever...");
            break; // Added break statement to prevent infinite loop
        }
    }

    // 🟠 CRITICAL: Null dereference (Rule: java:S2259)
    public void riskyAccess(String str) {
        // Check for null before accessing the object's method
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null");
        }
    }

    // 🟡 MAJOR: High cognitive complexity (Rule: java:S3776)
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

    // Main method to illustrate usage (Sonar will analyze code without needing to run)
    public static void main(String[] args) {
        MixedSeverityNonSecurity test = new MixedSeverityNonSecurity();
        // ⚠️ Do not call infiniteLoop(), or program will hang
        // test.infiniteLoop();
        test.riskyAccess(null); // Will throw at runtime
        System.out.println(test.complexFunction(7));
    }
}
