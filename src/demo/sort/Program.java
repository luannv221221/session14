package demo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"B",18));
        students.add(new Student(2,"D",17));
        students.add(new Student(3,"A",20));

        for (Student student : students) {
            System.out.println(student.toString());
        }

        // sắp xếp sinh viên theo tuôi tằng dần
        Collections.sort(students);
        System.out.println("Sau kho sap xep");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // sắp xếp theo tuổi
    }
}
