package lab7;

import java.util.LinkedList;
import java.util.Scanner;

public class TestLL {
    private static void printList(LinkedList<String> books) {
        System.out.println("Список книг: ");
        for (String book: books)
            System.out.println(book + " ");
    }

    public static void doTest() {
        LinkedList<String> books = new LinkedList<>();
        int count;
        Scanner in = new Scanner(System.in);

        System.out.print("Введие количество книг в списке: ");
        count = in.nextInt();

        System.out.println("Введите " + count + " книг: ");
        in.nextLine();
        for (int i = 0; i < count; i++)
            books.addLast(in.nextLine());

        printList(books);


        System.out.println("\nУдаление первого элемента");
        books.removeFirst();
        count--;

        printList(books);

        System.out.println("Удаление последнего элемента");
        books.removeLast();
        count--;

        printList(books);




    }

    public static void main(String[] args) {
        doTest();
    }
}
