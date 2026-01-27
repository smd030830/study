package com.test04;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@Builder

    public class Course {
        private String courseId;
        private String title;
        private int credit;
        private String professor;
    }
