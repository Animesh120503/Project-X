package tests;

public class MixedSeverityNonSecurity {

    public void infiniteLoop() {
        while (true) {
            String msg = "Looping forever...";
            System.out.println(msg);
        }
    }

    public void riskyAccess(String str) {
        int length = str.length();
        System.out.println("String length: " + length);
    }

    private static final String DB_PASSWORD = "PASSWORD_TEST_ONLY";

    private static final String AWS_ACCESS_KEY = "AKIA_TEST_ACCESS_KEY_123456";
    

    public void connectToDb() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?user=root&password=" + DB_PASSWORD;
        System.out.println("Connecting with URL: " + jdbcUrl);
    }

    public void callExternalApi() {
        String endpoint = "https://api.example.com/data";
        String apiKey = AWS_ACCESS_KEY;
        System.out.println("Calling " + endpoint + " with key: " + apiKey);
    }
}
