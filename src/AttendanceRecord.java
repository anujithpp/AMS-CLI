package src;

import java.util.Date;

public class AttendanceRecord {
    private Teacher teacher;
    private Student student;
    private Date date;
    private boolean isPresent;
    private boolean isLate;

    public AttendanceRecord(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
        this.date = new Date(); // Assuming current date
    }

    // Getters and setters for other attributes
}
