package com.sinu.sinu.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "enrollments")
public class Enrollment implements Serializable {

    @EmbeddedId
    private EnrollmentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("courseId")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId")
    private Student student;

    @Column(name = "grade")
    private Long grade;

    @Column(name = "status")
    private String status;

    public Enrollment() {
    }

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.id = new EnrollmentId(course.getId(), student.getId());
        this.status = "INIT";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

        public EnrollmentId getId() {
        return id;
    }

    public void setId(EnrollmentId id) {
        this.id = id;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long mark) {
        this.grade = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, grade, status);
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", grade=" + grade +
                ", status='" + status + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Enrollment{" +
//                "course=" + course +
//                ", student=" + student +
//                ", grade=" + grade +
//                ", status='" + status + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Enrollment that = (Enrollment) o;
//        return Objects.equals(course, that.course) &&
//                Objects.equals(student, that.student) &&
//                Objects.equals(grade, that.grade) &&
//                Objects.equals(status, that.status);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(course, student, grade, status);
//    }

}
