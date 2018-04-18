package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

//    public List<Student> listStudents();
//
//    public Student getStudentByUsername(String username);
//
//    public Student getStudentById(Long id);
//
//    public void updateStudent(Student student);

}
