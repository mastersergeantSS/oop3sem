package ru.mirea.lab1;


public class Main {
    public static void main(String[] args) {
        double num;
        System.out.println("Первые 10 элементов гармонического ряда: ");
        for (int i = 1; i <= 10; i++) {
            num = (double)1/i;
            System.out.println(num + ", ");
        }
    }
}
