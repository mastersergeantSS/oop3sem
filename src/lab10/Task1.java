package lab10;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static <E> List<E> convertToList(E[] a) {
        List<E> cList = new LinkedList<>();

        for (E elem: a) {
            cList.add(elem);
        }
        System.out.println(cList);
        return cList;
    }

    public static void main(String[] args) {
        String[] countries = {"Korea", "Japan", "Russia", "Peru", "Canada"};
        convertToList(countries);
        Integer[] degreesOf2 = {2, 4, 8, 16, 32, 64, 128, 256, 512};
        convertToList(degreesOf2);
    }

}
