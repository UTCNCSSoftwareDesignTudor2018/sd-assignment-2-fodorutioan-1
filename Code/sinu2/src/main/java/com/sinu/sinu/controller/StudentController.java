package com.sinu.sinu.controller;

import com.sinu.sinu.service.StudentService;
import com.sinu.sinu.service.implementation.StudentServiceImpl;
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
    private StudentServiceImpl studentServiceImpl;

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

//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }



}
