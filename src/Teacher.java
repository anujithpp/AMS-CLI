package src;

import java.util.List;

public class Teacher extends User {
    public Teacher(String username, String password) {
        super(username, password);
    }

    public void markAttendance(List<Student> students, String filePath) {
        for (Student student : students) {
            // Create AttendanceRecord objects and associate the teacher
            AttendanceRecord attendanceRecord = new AttendanceRecord(this, student);
            // Store or process the attendance record
            System.out.println("Marked attendance for student: " + student.getUsername());
        }
    }

    public void viewReports(List<Student> students) {
        // Your view reports logic here
    }
}
