package lab9;

// Задание 1

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempting division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 e = new Exception1();
        e.exceptionDemo();
    }
}
