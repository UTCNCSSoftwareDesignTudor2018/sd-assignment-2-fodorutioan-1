package com.sinu.sinu.service;

import com.sinu.sinu.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    public List listStudents();

    public Student getStudentByUsername(String username);

    public Optional<Student> getStudentById(Long id);

    public void updateStudent(Student student);

}
