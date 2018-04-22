package com.sinu.sinu.controller;

import com.sinu.sinu.entity.Course;
import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.StudentRepository;
import com.sinu.sinu.service.CourseService;
import com.sinu.sinu.service.EnrollmentService;
import com.sinu.sinu.service.StudentService;
import com.sinu.sinu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

//@SuppressWarnings("ALL")
//@RestController
//@RequestMapping(path = "/api/students/")
//@Api(value = "StudentControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private EnrollmentService enrollmentService;

    @Autowired
    private CourseService courseService;

    @RequestMapping(value="/student")
    public ModelAndView student() {
        ModelAndView modelAndView = new ModelAndView("student");
        System.out.println(studentService.getStudentById(1L).get());
        modelAndView.addObject("studentInfo", studentService.getStudentById(1L).get());
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

//    @RequestMapping(value = "/student/courses", method = RequestMethod.GET)
//    public String listEnrolledCourses() {
//
//    }

//    @RequestMapping(value="/student", method = RequestMethod.GET)
//    public String listStudents(Model model) {
//        return new ModelAndView("student");
//    }

//    @GetMapping("/")
//    String student() {
//        return "student";
//    }

//    private Logger Log = LoggerFa.getLogger(StudentController.class);

}
