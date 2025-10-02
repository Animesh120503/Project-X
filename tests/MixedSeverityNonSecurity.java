package wrongPackage;

public class MixedSeverityNonSecurity {

    public void infiniteLoop() {
        int counter = 0;
        while (counter < 10) { // finite loop to avoid security vulnerability
            String msg = "Looping iteration " + counter;
            System.out.println(msg); // code smell: use of System.out
            counter++;
        }
    }

    public void riskyAccess(String str) {
        if (str != null) {
            System.out.println("String length: " + str.length()); // code smell: System.out
        } else {
            System.out.println("String is null"); // bug: risky behavior without proper exception
        }
    }

    public void complexLogic(int x) {
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
        System.out.println("Result: " + result); // code smell: System.out
    }

    public void nestedLoops(int n) {
        for (int i = 0; i < n; i++) { // cognitive complexity test
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println("Even sum: " + (i + j)); // code smell
                } else {
                    System.out.println("Odd sum: " + (i + j)); // code smell
                }
            }
        }
    }
}
