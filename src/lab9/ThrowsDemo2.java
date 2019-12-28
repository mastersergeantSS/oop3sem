package lab9;

// Задание 6

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        try {
            if (key == "") {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }
        catch (Exception e) {
            System.out.println("String is empty");
            return "data for nothing";
        }
    }

    public static void main(String[] args) {
        ThrowsDemo2 o = new ThrowsDemo2();
        o.getKey();
    }
}
