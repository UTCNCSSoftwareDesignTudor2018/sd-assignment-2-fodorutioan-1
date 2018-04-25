package com.sinu.sinu;

import com.sinu.sinu.service.EnrollmentService;
import com.sinu.sinu.service.ReportService;
import com.sinu.sinu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories("com.sinu.sinu.repository")
//@ComponentScan(basePackages = {"com.sinu.sinu.entity", "com.sinu.sinu.controller", "com.sinu.sinu.service"})
//@EntityScan(basePackages = {"com.sinu.sinu.entity"})
public class SinuApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SinuApplication.class, args);

    }
    @Autowired
    private EnrollmentService enrollmentService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private ReportService reportService;

    @Override
    public void run(String... args) throws Exception {
//        List<Student> students = studentService.listStudents();//studentRepository.findAll();
//        System.out.println(students);
//        List<Teacher> teachers = teacherService.listTeachers();
//        System.out.println(teachers);
//        Optional<Student> student = studentService.getStudentByUsername("windler.eden");
//        System.out.println(student);
//
//        Report report = new Report(enrollmentService.getEnrollmentsByStudent(studentService.getStudentById(3L).get()).toString());
//        System.out.println(enrollmentService.getEnrollmentsByStudent(studentService.getStudentById(3L).get()));
//        System.out.println(reportService.save(report));
////      Optional<Student> student1 = studentService.getStudentById(5L);
//        System.out.println(student1);
        //CourseService courseService = new CourseService();
        //System.out.println(studentService.getStudentById(5L).get());
        //List<Course> courses = studentService.getStudentById(5L).get().getCourses();

    }

}
