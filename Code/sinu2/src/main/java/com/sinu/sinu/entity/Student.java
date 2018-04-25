package com.sinu.sinu.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cnp")
    private String CNP;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "study_group")
    private String group;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(
            mappedBy = "student",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Enrollment> courses = new ArrayList<>();

    @OneToMany(
            mappedBy = "student",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Registration> exams = new ArrayList<>();

    public void addExam(Exam exam) {
        Registration registration = new Registration(exam, this);
        exams.add(registration);
        exam.getStudents().add(registration);
    }

    public void removeExam(Exam exam) {
        for (Iterator<Registration> iterator = exams.iterator();
             iterator.hasNext(); ) {
            Registration registration = iterator.next();

            if (registration.getStudent().equals(this) &&
                    registration.getExam().equals(exam)) {
                iterator.remove();
                registration.getExam().getStudents().remove(registration);
                registration.setStudent(null);
                registration.setExam(null);
            }
        }
    }

    public List<Exam> getExams() {
        List<Exam> examsList = new ArrayList<>();
        for (Iterator<Registration> iterator = exams.iterator();
             iterator.hasNext(); ) {
            Registration registration = iterator.next();
            if (registration.getStudent().equals(this)) {
                examsList.add(registration.getExam());
            }
        }
        return examsList;
    }



    public void addCourse(Course course) {
        Enrollment enrollment = new Enrollment(this, course);
        courses.add(enrollment);
        course.getStudents().add(enrollment);
    }

    public void removeCourse(Course course) {
        for (Iterator<Enrollment> iterator = courses.iterator();
             iterator.hasNext(); ) {
            Enrollment enrollment = iterator.next();

            if (enrollment.getStudent().equals(this) &&
                    enrollment.getCourse().equals(course)) {
                iterator.remove();
                enrollment.getCourse().getStudents().remove(enrollment);
                enrollment.setStudent(null);
                enrollment.setCourse(null);
            }
        }
    }

    public List<Course> getCourses() {
        List<Course> coursesList = new ArrayList<>();
        for (Iterator<Enrollment> iterator = courses.iterator();
             iterator.hasNext(); ) {
            Enrollment enrollment = iterator.next();
            if (enrollment.getStudent().equals(this)) {
                coursesList.add(enrollment.getCourse());
            }
        }
        return coursesList;
    }

    public Student() {
    }

    public Student(Long id, String name, String CNP, String address, String email, String group, String username, String password) {
        this.id = id;
        this.name = name;
        this.CNP = CNP;
        this.address = address;
        this.email = email;
        this.group = group;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", CNP='" + CNP + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(CNP, student.CNP) &&
                Objects.equals(address, student.address) &&
                Objects.equals(email, student.email) &&
                Objects.equals(group, student.group) &&
                Objects.equals(username, student.username) &&
                Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, CNP, address, email, group, username, password);
    }
}