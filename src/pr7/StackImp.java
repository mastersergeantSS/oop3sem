package pr7;

import java.util.Collection;
import java.util.Stack;
import java.util.Scanner;


class Game {
    private static int count = 0;

    public static int compare(int f, int s) {
        if (f == 0 || f > s)
            return 1;
        if (s == 0 || f < s)
            return -1;
        return 0;
    }

    public static void move() { ++count; }

    public static <E> boolean check(Collection col1, Collection col2) {
        if (col1.isEmpty()) {
            System.out.println("second " + String.valueOf(count));
            return false;
        }
        if (col2.isEmpty()) {
            System.out.println("first " + String.valueOf(count));
            return false;
        }

        if (count > 106) {
            System.out.println("Botva");
            return false;
        }
        return true;
    }
}

public class StackImp {
    public static void play() {

        Stack<Integer> first = new Stack<>();
        // 3 5 2 8 0

        Stack<Integer> second = new Stack<>();
        // 6 7 1 9 4

        Stack<Integer> temp = new Stack<>();

        int firstTop;
        int secondTop;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5 карт первого игрока: ");
        for (int i = 0; i < 5; i++)
            first.push(Integer.parseInt(in.next()));
        System.out.println("Введите 5 карт второго игрока игрока: ");
        for (int i = 0; i < 5; i++)
            second.push(Integer.parseInt(in.next()));

        while (Game.check(first, second)) {
            firstTop = first.pop();
            secondTop = second.pop();
            Game.move();

            if (Game.compare(firstTop, secondTop) > 0) {
                for (int el: first)
                    temp.push(el);
                temp.push(firstTop);
                temp.push(secondTop);
                for (int el: temp)
                    first.push(el);
            }
            else {
                for (int el: second)
                    temp.push(el);
                temp.push(secondTop);
                temp.push(firstTop);
                for (int el: temp)
                    second.push(el);
            }
        }

    }

    public static void main(String[] args) {
        play();
    }
}
