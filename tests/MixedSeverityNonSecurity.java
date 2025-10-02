package com.example;

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

//    public int complexFunction(int x) {
//        int result = 0;
//        if (x > 0) {
//            if (x % 2 == 0) {
//                result += 2;
//            } else {
//                result += 3;
//            }
//        } else {
//            if (x < -10) {
//                result -= 10;
//            } else if (x < -5) {
//                result -= 5;
//            } else {
//                result -= 1;
//            }
//        }
//        return result;
//    }
}
