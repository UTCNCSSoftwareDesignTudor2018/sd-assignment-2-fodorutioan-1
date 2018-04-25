package com.sinu.sinu.service;

import com.sinu.sinu.entity.Teacher;
import com.sinu.sinu.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> listTeachers() {
        return this.teacherRepository.findAll();
    }
    public Optional<Teacher> getTeacherByUsername(String username) {
        return this.teacherRepository.findByUsername(username);
    }
    public Optional<Teacher> getTeacherById(Long id) {
        return this.teacherRepository.findById(id);
    }
    public Teacher save(Teacher teacher) {
        return this.teacherRepository.save(teacher);
    }

}
