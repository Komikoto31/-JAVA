package Lab_11;

import java.util.Arrays;

public class Student_test {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        long[] ids = new long[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(-i, "Name" + i, i * 10);
            ids[i] = students[i].getId();
        }
        System.out.println(Arrays.toString(ids));
        new Student_test().bubbleSort(ids);
        System.out.println(Arrays.toString(ids));
    }

    public void bubbleSort(long[] ids) {
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] > ids[i + 1]) {
                long temp = ids[i];
                ids[i] = ids[i + 1];
                ids[i + 1] = temp;
            }
        }
    }

}
