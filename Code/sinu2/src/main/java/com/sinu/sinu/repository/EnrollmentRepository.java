package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Enrollment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EnrollmentRepository extends CrudRepository<Enrollment, Long> {

//    public List<Enrollment> getEnrollmentsByStudentId(Long studentId);
//
//    public void addEnrollment(Enrollment enrollment);

}
