package com.sinu.sinu.service.implementation;

import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.Util;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listStudents() {
        return Util.toList(studentRepository.findAll());
    }

    public Student getStudentByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void updateStudent(Student student) {
        this.studentRepository.save(student);
    }
}
