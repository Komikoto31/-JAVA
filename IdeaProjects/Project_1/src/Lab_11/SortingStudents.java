package Lab_11;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {

    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student(i, "Name" + i, i * 10);
        }
        Student[] students2 = new Student[7];
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student(-i, "Name" + i, i * 10);
        }
        Student[] result = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, result, 0, students1.length);
        System.arraycopy(students2, 0, result, students1.length, students2.length);
        new SortingStudents().sort(result);
        System.out.println(Arrays.toString(result));
    }

    public void sort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            if (compare(students[i], students[i + 1]) > 0) {
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
            }
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getTotalScore().compareTo(o2.getTotalScore());
    }
}
