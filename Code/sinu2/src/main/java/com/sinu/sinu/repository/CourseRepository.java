package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Course;
import com.sinu.sinu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> findAll();

    //public List<Course> findAllByStudent(Student student);

    //public List<Course> listCourses();

    //public List<Course> getCoursesTakenByStudentId(Long studentId);
}
