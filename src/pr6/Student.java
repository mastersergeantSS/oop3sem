package pr6;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int iDNumber;
    private double GPA;

    public Student(String name, String surname, int iDNumber, double GPA) {
        this.name = name;
        this.surname = surname;
        this.iDNumber = iDNumber;
        if (GPA > 5.0)
            this.GPA = 5;
        else if (GPA < 0.0)
            this.GPA = 0;
        else this.GPA = GPA;
    }

    public int getIDNumber() {
        return this.iDNumber;
    }

    public double getGPA() {
        return  this.GPA;
    }

    public int compareTo(Student c) {
        return iDNumber - c.getIDNumber();
        // return (GPA > c.getGPA()) ? 1 : ((GPA == c.getGPA()) ? 0 : -1); // При сортировке по GPA
    }

}
