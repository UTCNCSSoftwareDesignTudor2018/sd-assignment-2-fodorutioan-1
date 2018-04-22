package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findByIdStudentId(Long studentId);
    Enrollment save(Enrollment enrollment);
}
