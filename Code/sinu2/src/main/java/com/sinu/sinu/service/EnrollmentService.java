package com.sinu.sinu.service;

import com.sinu.sinu.entity.Enrollment;
import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getEnrollmentsByStudent(Student student) {
        return this.enrollmentRepository.findAllByStudent(student);
    }

    public Enrollment save(Enrollment enrollment){
        return this.enrollmentRepository.save(enrollment);
    }
}
