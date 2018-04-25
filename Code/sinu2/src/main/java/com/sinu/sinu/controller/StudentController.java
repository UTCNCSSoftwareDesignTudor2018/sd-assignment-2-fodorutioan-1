package com.sinu.sinu.controller;

import com.sinu.sinu.entity.*;
import com.sinu.sinu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

//@SuppressWarnings("ALL")
//@RestController
//@RequestMapping(path = "/api/students/")
//@Api(value = "StudentControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
@Configurable
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private EnrollmentService enrollmentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ExamService examService;

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(value="/student")
    public ModelAndView student() {
        ModelAndView modelAndView = new ModelAndView("student");

        Student student = studentService.getStudentById(5L).get();

        List<Course> courses = student.getCourses();
        List<Course> toEnrollCourses = courseService.getCoursesNotEnrolledByStudent(student);
        List<Course> course = new ArrayList<>();
        System.out.println("TO ENROLL COURSES!!!\n\n\n\n" + toEnrollCourses);

        List<Exam> exams = student.getExams();
        List<Exam> toRegisterExams = examService.getExamsNotRegisteredByStudent(student);
        System.out.println("TO REGISTER EXAMS!!!\n\n\n\n" + toRegisterExams);
        List<Exam> exam = new ArrayList<>();

        modelAndView.addObject("studentInfo", studentService.getStudentById(5L).get());

        modelAndView.addObject("to_enroll_courses", toEnrollCourses);
        modelAndView.addObject("courses", courses);
        modelAndView.addObject("course", course);

        modelAndView.addObject("to_register_exams", toRegisterExams);
        modelAndView.addObject("exams", exams);
        modelAndView.addObject("exam", exam);
        return modelAndView;
    }

    @RequestMapping(value="/student/edit")
    public RedirectView edit(HttpServletRequest request) {
        Long id = 1L;//Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String CNP = request.getParameter("CNP");
        String group = request.getParameter("group");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        studentService.save(new Student(id, name, CNP, address, email, group, username, password));
        return new RedirectView("/student");
    }

    @RequestMapping(value="/student/enroll")
    public RedirectView enroll(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("enroll");
        Student student = studentService.getStudentById(5L).get();
        Long id = Long.parseLong(request.getParameter("courseId"));
        Course course = courseService.getCourseById(id).get();
        enrollmentService.save(new Enrollment(student, course));
        student.addCourse(course);
        return new RedirectView("/student");
    }

    @RequestMapping(value="/student/register")
    public RedirectView register(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("register");
        Student student = studentService.getStudentById(5L).get();
        Long id = Long.parseLong(request.getParameter("examId"));
        Exam exam = examService.getExamById(id).get();
        System.out.println("\n\n\n\n\nSTUDENT IS: " + student);
        System.out.println("\n\n\n\n\nEXAM IS: " + exam);
        registrationService.save(new Registration(exam, student));
        student.addExam(exam);
        //studentService.save(student);
        return new RedirectView("/student");
    }

}
