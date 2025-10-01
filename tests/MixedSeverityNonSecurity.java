public class MixedSeverityNonSecurity {

    public void infiniteLoop() {
        while (true) {
            System.out.println("Looping forever...");
        }
    }

    public void riskyAccess(String str) {
        System.out.println(str.length());
    }
}
