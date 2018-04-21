package com.sinu.sinu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

    @RequestMapping(value="/")
    public ModelAndView mainPage() {
        return new ModelAndView("main");
    }

    @RequestMapping(value="/index")
    public ModelAndView indexPage() {
        return new ModelAndView("main");
    }
}