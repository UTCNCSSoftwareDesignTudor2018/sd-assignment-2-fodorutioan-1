package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findAll();
    Optional<Teacher> findById(Long id);
    Optional<Teacher> findByUsername(String username);
    Teacher save(Teacher student);
}
