package wrongPackage;

public class MixedSeverityNonSecurity {

    // Infinite loop (bug / code smell)
    public void infiniteLoop() {
        while (true) {
            String msg = "Looping forever...";
            System.out.println(msg); // code smell: use of System.out
        }
    }

    // Risky access (bug)
    public void riskyAccess(String str) {
        int length = str.length(); // will throw NullPointerException if str is null
        System.out.println("String length: " + length); // code smell: System.out
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
        for (int i = 0; i < n; i++) { // code smell: nested loops
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println("Even sum: " + (i + j)); // code smell: System.out
                } else {
                    System.out.println("Odd sum: " + (i + j)); // code smell: System.out
                }
            }
        }
    }

    // Redundant conditional (code smell)
    public void redundantCheck(int num) {
        if (num > 0) {
            if (num > 0) {
                System.out.println("Number is positive"); // code smell: redundant condition
            }
        }
    }
}
