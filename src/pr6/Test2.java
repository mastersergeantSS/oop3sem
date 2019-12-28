package pr6;

public class Test2 {

    public static Student[] doSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length+a2.length];
        for (int i = 0; i < a1.length; i++)
            a3[i] = a1[i];
        for (int i = a1.length; i < a3.length; i++)
            a3[i] = a2[i-a1.length];
        MergeSort.sort(a3, 0, a3.length-1);
        return  a3;
    }

    public static void main(String[] args) {
        Student[] ss1 = new Student[4];
        ss1[0] = new Student("Michael", "Nate", 8, 4);
        ss1[1] = new Student("Chis", "Wick", 2, 5);
        ss1[2] = new Student("Andrea", "Volt", 5, 3.1);
        ss1[3] = new Student("Mike", "White", 3, 1);

        Student[] ss2 = new Student[4];
        ss2[0] = new Student("Frank", "Sinatra", 23, 3.6);
        ss2[1] = new Student("Perry", "Como", 2, 2.3);
        ss2[2] = new Student("Will", "Smith", 1, 3.9);
        ss2[3] = new Student("Marshal", "Matters", 3, 4.0);

        Student[] ss3 = new Student[ss1.length+ss2.length];
        System.arraycopy(ss1, 0, ss3, 0, ss1.length);
        System.arraycopy(ss2, 0, ss3, ss1.length, ss2.length);

        MergeSort.sort(ss3, 0, ss3.length-1);

        for (int i = 0; i < ss3.length; i++) {
            System.out.println(ss3[i].getGPA());
        }


    }
}
