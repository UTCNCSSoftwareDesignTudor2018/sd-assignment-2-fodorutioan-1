package com.sinu.sinu.service.implementation;

import com.sinu.sinu.entity.Teacher;
import com.sinu.sinu.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl {

    @Autowired
    private TeacherRepository teacherRepository;

    @Transactional
    public List<Teacher> listTeachers() {
        return this.teacherRepository.findAll();
    }

    @Transactional
    public Teacher getTeacherByUsername(String username) {
        return this.teacherRepository.findByUsername(username);
    }

    @Transactional
    public Optional<Teacher> getTeacherById(Long id) {
        return this.teacherRepository.findById(id);
    }

    @Transactional
    public void updateTeacher(Teacher teacher) {
        this.teacherRepository.save(teacher);
    }

}
