package com.sinu.sinu.entity;


import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "room")
    private String room;

    @Column(name = "date")
    private Date date;

    public Exam() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return Objects.equals(id, exam.id) &&
                Objects.equals(course, exam.course) &&
                Objects.equals(room, exam.room) &&
                Objects.equals(date, exam.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, course, room, date);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", course=" + course +
                ", room='" + room + '\'' +
                ", date=" + date +
                '}';
    }
}
