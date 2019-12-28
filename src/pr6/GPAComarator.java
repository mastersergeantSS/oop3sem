package pr6;

import java.util.Comparator;

public class GPAComarator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        Double d1 = s1.getGPA();
        Double d2 = s2.getGPA();
        return d1.compareTo(d2);
    }
}
