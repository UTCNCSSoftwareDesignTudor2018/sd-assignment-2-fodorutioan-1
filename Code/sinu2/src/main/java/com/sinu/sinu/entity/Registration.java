package com.sinu.sinu.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "registrations")
public class Registration {

    @EmbeddedId
    private RegistrationId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("examId")
    private Exam exam;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId")
    private Student student;

    @Column(name = "status")
    private String status;

    public Registration() {
    }

    public Registration(Exam exam, Student student) {
        this.id = new RegistrationId(exam.getId(), student.getId());
        this.exam = exam;
        this.student = student;
        this.status = "INIT";
    }

    public RegistrationId getId() {
        return id;
    }

    public void setId(RegistrationId id) {
        this.id = id;
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
        Registration that = (Registration) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, status);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId=" + id +
                ", status='" + status + '\'' +
                '}';
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Exam getExam() {
        return exam;
    }

    public Student getStudent() {
        return student;
    }
}
