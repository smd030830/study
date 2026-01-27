package com.test04;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Student {
    private String studentId;
    private String name;
    private List<Enrollment> enrollments;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrollments = new ArrayList<>();
    }
    public void enroll(Course course) {
        Enrollment enrollment = new Enrollment(course);
        this.enrollments.add(enrollment);
    }

    public void setGradeForCourse(String courseId, double score) {
        for (Enrollment e : enrollments) {
            if (e.getCourse().getCourseId().equals(courseId)) {
                e.updateScore(score);
                return;
            }
        }
        System.out.println("해당 강의를 수강하고 있지 않습니다.");
    }
}