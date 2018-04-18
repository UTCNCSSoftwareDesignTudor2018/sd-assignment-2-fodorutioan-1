package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {

    public List<Course> findAll();

    public List<Course> findByStudentId(Long studentId);

    //public List<Course> listCourses();

    //public List<Course> getCoursesTakenByStudentId(Long studentId);
}
