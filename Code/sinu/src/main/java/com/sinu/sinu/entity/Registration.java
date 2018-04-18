package com.sinu.sinu.entity;

import org.springframework.data.annotation.Id;

public class Registration {
    @Id
    private Long exam_id;
    private Long student_id;
    private String status;

    public Registration() {
    }

    public Long getExam_id() {
        return exam_id;
    }

    public void setExam_id(Long exam_id) {
        this.exam_id = exam_id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
