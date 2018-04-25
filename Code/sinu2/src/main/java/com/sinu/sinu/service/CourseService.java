package com.sinu.sinu.service;

import com.sinu.sinu.entity.Course;
import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCoursesNotEnrolledByStudent(Student student){

        List<Course> coursesList = courseRepository.findAll();
        List<Course> enrolledCourses = student.getCourses();
        List<Course> notEnrolledCourses = new ArrayList<>();

        for (Course c2: coursesList) {
            boolean belongs = false;
            for (Course c: enrolledCourses) {
                if (c.equals(c2)) {
                    belongs = true;
                }
            }
            if (!belongs) {
                notEnrolledCourses.add(c2);
            }
        }
        System.out.println("ENROLLED" + enrolledCourses);
        System.out.println("NOT ENROLLED" + notEnrolledCourses);
        return notEnrolledCourses;
    }

    public Optional<Course> getCourseById(Long id) {
        return this.courseRepository.findById(id);
    }

}
