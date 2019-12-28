package lab9;

// задание 7

import java.util.Scanner;

public class ThrowsDemo3 {
    public boolean getKey() {
        try {
            boolean flag = true;
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            printDetails(key);
            return false;
        }
        catch (Exception e) {
            return true;
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String args[]) {
        ThrowsDemo3 obj = new ThrowsDemo3();
        while (obj.getKey());

    }

}
