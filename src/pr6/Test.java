package pr6;

public class Test {
    /*Function to sort array using insertion sort*/
    public static void sortById(Student[] arr)
    {
        for (int i = 1; i < arr.length; ++i) {
            Student temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0 ) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] ss = new Student[4];
        ss[0] = new Student("Michael", "Nate", 8, 4);
        ss[1] = new Student("Chis", "Wick", 2, 5);
        ss[2] = new Student("Andrea", "Volt", 5, 3.1);
        ss[3] = new Student("Mike", "White", 3, 1);


       for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i].getGPA());
        }
       SortingStudentsByGPA.qSort(ss, 0, ss.length-1);
        System.out.println("\n");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i].getGPA());
        }

    }
}
