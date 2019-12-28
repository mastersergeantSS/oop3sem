package pr6;

import java.util.Comparator;

public class SortingStudentsByGPA {

    public static void qSort(Student[] a, int low, int high) {
        Comparator c = new GPAComarator();
        if (a.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low)/2;
        Student sup = a[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (c.compare(a[i], sup) > 0) {
                i++;
            }

            while (c.compare(a[j], sup) < 0) {
                j--;
            }

            if (i<=j) {
                Student temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            qSort(a, low, j);
        if (high > i)
            qSort(a, i, high);

    }
}
