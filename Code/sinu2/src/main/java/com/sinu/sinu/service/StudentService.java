package com.sinu.sinu.service;

import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.Util;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listStudents() {
        return Util.toList(this.studentRepository.findAll());
    }
    public Optional<Student> getStudentByUsername(String username) {
        return this.studentRepository.findByUsername(username);
    }
    public Optional<Student> getStudentById(Long id) {
        return this.studentRepository.findById(id);
    }
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }
}
