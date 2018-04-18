package com.sinu.sinu.entity;


import javax.persistence.Id;
import java.sql.Date;


public class Enrollment {
    @Id
    private Long student_id;
    private Long course_id;
    private Long grade;
    private String status;

    public Enrollment() {
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
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
}
