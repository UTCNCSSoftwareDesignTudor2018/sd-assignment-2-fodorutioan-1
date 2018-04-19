package com.sinu.sinu.service;

import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.Util;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //public StudentServiceImpl(StudentRepository studentRepository) {
        //this.studentRepository = studentRepository;
   // }

    @Override
    @Transactional
    public List<Student> listStudents() {
        return Util.toList(studentRepository.findAll());
    }

    @Override
    @Transactional
    public Student getStudentByUsername(String username) {
        return null;//studentRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        this.studentRepository.save(student);
    }
}
