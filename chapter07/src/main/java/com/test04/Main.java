package com.test04;

//개인과제4:
//학생이 강의를 수강해서 성적을 받는 생활을 클래스 설계 해보세요.
//클래스는 학생, 강의과목, 학생이 과목을 수강 하고 성적을 받는 과정의
//데이터가 잘 저장되고 표현 되도록 설계 해보세요.
//정답은 없으므로 여러분의 경험에 기반하여 클래스를 만들어 봅니다.
//속성과 동작을 잘 구분하여 만들고 Lombok 을 활용 합니다.
//클래스 이름 속성, 동작 이름은 자유롭습니다.
//설계한 소스는 개인과제 git 리포지토리에 올립니다.
//기한은 약 1~3시간 정도 개발할 양이면 됩니다. 너무 적어도 많아도 안됩니다.
public class Main {
    public static void main(String[] args) {
        Course javaCourse = Course.builder()
                .courseId("CS101")
                .title("자바 프로그래밍")
                .credit(3)
                .professor("홍길동 교수")
                .build();

        Course dbCourse = Course.builder()
                .courseId("CS102")
                .title("데이터베이스")
                .credit(3)
                .professor("이순신 교수")
                .build();

        Student student = new Student("20240001", "김철수");

        System.out.println("수강 신청 시작");
        student.enroll(javaCourse);
        student.enroll(dbCourse);
        System.out.println(student.getName() + " 학생이 " + student.getEnrollments().size() + "개 과목을 신청했습니다.");

        System.out.println("기말고사 성적 입력");
        student.setGradeForCourse("CS101", 98.5);
        student.setGradeForCourse("CS102", 85.0);

        System.out.println("최종 성적 표");
        System.out.println("학번: " + student.getStudentId());
        System.out.println("이름: " + student.getName());
        System.out.println();
        System.out.printf("%-10s | %-15s | %-5s | %-5s\n", "과목코드", "과목명", "점수", "등급");
        System.out.println();

        for (Enrollment e : student.getEnrollments()) {
            System.out.printf("%-10s | %-15s | %-5.1f | %-5s\n",
                    e.getCourse().getCourseId(),
                    e.getCourse().getTitle(),
                    e.getScore(),
                    e.getGrade());
        }
    }
}
