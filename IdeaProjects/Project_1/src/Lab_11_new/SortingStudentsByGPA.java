package Lab_11_new;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "Name" + i, i * 10);
        }
        System.out.println(Arrays.toString(students));
        new SortingStudentsByGPA().bubbleSortReversed(students);
        System.out.println(Arrays.toString(students));
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getTotalScore().compareTo(o2.getTotalScore());
    }

    public void bubbleSortReversed(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            if (compare(students[i], students[i + 1]) < 0) {
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
            }
        }
    }
}
