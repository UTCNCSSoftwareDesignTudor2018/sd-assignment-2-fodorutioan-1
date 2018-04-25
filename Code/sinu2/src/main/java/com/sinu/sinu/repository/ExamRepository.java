package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    public Optional<Exam> findById(Long id);
}
