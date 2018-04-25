package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Enrollment;
import com.sinu.sinu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findAllByStudent(Student student);
    Enrollment save(Enrollment enrollment);
}
