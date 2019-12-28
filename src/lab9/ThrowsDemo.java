package lab9;

// Задание 5
/**
public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        }
        catch (NullPointerException e) {
            System.out.println("Null key in params");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo c = new ThrowsDemo();
        c.getDetails(null);
    }
}
**/



public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for" + key;
        }
        catch (NullPointerException e) {
            return "null key in params";
        }
    }

    public static void main(String[] args) {
        ThrowsDemo c = new ThrowsDemo();
        c.printMessage(null);
    }
}

