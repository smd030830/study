package com.test04;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Enrollment {
    private Course course;
    private double score;
    private String grade;

    public Enrollment(Course course) {
        this.course = course;
        this.score = 0.0;
        this.grade = "F";
    }

    public void updateScore(double score) {
        this.score = score;
        if (score >= 95) this.grade = "A+";
        else if (score >= 90) this.grade = "A";
        else if (score >= 80) this.grade = "B";
        else if (score >= 70) this.grade = "C";
        else this.grade = "F";
    }
}