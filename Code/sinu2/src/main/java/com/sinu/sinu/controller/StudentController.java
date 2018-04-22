package com.sinu.sinu.controller;

import com.sinu.sinu.entity.Course;
import com.sinu.sinu.repository.StudentRepository;
import com.sinu.sinu.service.CourseService;
import com.sinu.sinu.service.EnrollmentService;
import com.sinu.sinu.service.StudentService;
import com.sinu.sinu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView mainPage() {
        return new ModelAndView("student");
    }

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
