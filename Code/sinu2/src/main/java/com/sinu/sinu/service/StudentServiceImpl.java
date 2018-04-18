package com.sinu.sinu.service;

import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student getStudentByUsername(String username) {
        return studentRepository.findByStudentUsername();
    }

    @Override
    @Transactional
    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        this.studentRepository.updateStudent(student);
    }
}
