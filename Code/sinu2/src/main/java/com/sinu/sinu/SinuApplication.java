package com.sinu.sinu;

import com.sinu.sinu.entity.Student;
import com.sinu.sinu.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
//@EntityScan(basePackageClasses=City.class)
public class SinuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SinuApplication.class, args);
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
        //List<Student> students = studentServiceImpl.listStudents();
        Optional<Student> student = studentServiceImpl.getStudentById(new Long(3));
        System.out.println(student);
    }
}
