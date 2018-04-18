package com.sinu.sinu.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RegistrationId implements Serializable {

    @Column(name = "exam_id")
    private Long examId;

    @Column(name = "student_id")
    private Long studentId;

    public RegistrationId() {
    }

    public RegistrationId(Long examId, Long studentId) {
        this.examId = examId;
        this.studentId = studentId;
    }

    public Long getExamId() {
        return examId;
    }

    public Long getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationId that = (RegistrationId) o;
        return Objects.equals(examId, that.examId) &&
                Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(examId, studentId);
    }
}
