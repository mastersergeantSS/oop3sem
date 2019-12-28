package lab9;

// Задание 2-4

import java.util.Scanner;



public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }

        catch (NumberFormatException e) {
            System.out.println("Некорректный ввод, ожалось целое число");
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
        catch (Exception e) {
            System.out.println("Ошибка");
        }
        finally {
            System.out.println("Блок finally");
        }
    }

    public static void main(String[] args) {
        Exception2 e = new Exception2();
        e.exceptionDemo();
    }
}

