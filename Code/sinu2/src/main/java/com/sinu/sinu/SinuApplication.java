package com.sinu.sinu;

import com.sinu.sinu.controller.StudentController;
import com.sinu.sinu.entity.Student;
import com.sinu.sinu.entity.Teacher;
import com.sinu.sinu.repository.StudentRepository;
import com.sinu.sinu.service.implementation.StudentServiceImpl;
import com.sinu.sinu.service.implementation.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
//@EnableJpaRepositories("com.sinu.sinu.repository")
//@ComponentScan(basePackages = {"com.sinu.sinu.entity", "com.sinu.sinu.controller", "com.sinu.sinu.service"})
//@EntityScan(basePackages = {"com.sinu.sinu.entity"})
public class SinuApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl studentService;

    @Autowired
    TeacherServiceImpl teacherService;

    public static void main(String[] args) {
        SpringApplication.run(SinuApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        List<Student> students = studentService.listStudents();//studentRepository.findAll();
        System.out.println(students);
        List<Teacher> teachers = teacherService.listTeachers();
        System.out.println(teachers);
    }

}
