package pr6;

import java.util.Comparator;

public class MergeSort {
    /** private static void merge(Student[] a, int l, int m, int r) {
        Comparator c = new GPAComarator();
        int s1 = m - l + 1;
        int s2 = r - m;

        Student[] left = new Student[s1];
        Student[] right = new Student[s2];

        for (int i = 0; i < s1; ++i)
            left[i] = a[l+i];
        for (int j = 0; j < s2; ++j)
            right[j] = a[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < s1 && j < s2)
        {
            if (c.compare(left[i], right[j]) <= 0) {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < s1) {
            a[k] = left[i];
            j++;
            k++;
        }

        while (j < s2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }


    public static void sort(Student[] a, int l, int r) {
        if (l < r) {
            int m = (l+r)/2;

            sort(a, l, m);
            sort(a, m+1, r);

            merge(a, l, m, r);
        }
    }**/
    private static void merge(Student[] arr, int l, int m, int r)
    {
        Comparator c = new GPAComarator();
        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (c.compare(L[i], R[j]) <= 0)
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void sort(Student[] arr, int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr , m+1, r);

            merge(arr, l, m, r);
        }
    }
}
