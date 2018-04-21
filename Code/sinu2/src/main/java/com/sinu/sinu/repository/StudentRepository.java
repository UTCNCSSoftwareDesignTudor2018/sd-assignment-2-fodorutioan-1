package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    Student findByUsername(String username);
    Student save(Student student);
}
