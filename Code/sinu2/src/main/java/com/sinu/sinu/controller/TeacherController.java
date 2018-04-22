package com.sinu.sinu.controller;

import com.sinu.sinu.service.ReportService;
import com.sinu.sinu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private ReportService reportService;

    @RequestMapping(value="/teacher")
    public ModelAndView mainPage() {
        return new ModelAndView("teacher");
    }


}
