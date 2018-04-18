package com.sinu.sinu.service;

import com.sinu.sinu.entity.Student;

import java.util.List;

public interface StudentService {

    public List listStudents();

    public Student getStudentByUsername(String username);

    public Student getStudentById(Long id);

    public void updateStudent(Student student);

}
