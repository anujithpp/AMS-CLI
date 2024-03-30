package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample usage
        Teacher teacher = new Teacher("teacher1", "password1");
        List<Student> students = new ArrayList<>();
        students.add(new Student("student1", "password1"));
        students.add(new Student("student2", "password2"));

        teacher.markAttendance(students, "filePath");
    }
}
