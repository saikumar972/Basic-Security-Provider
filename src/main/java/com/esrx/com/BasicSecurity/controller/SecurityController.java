package com.esrx.com.BasicSecurity.controller;

import com.esrx.com.BasicSecurity.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {
    @Autowired
    Student student;
    @RequestMapping("/ok")
    public String Sample(){
        student.setId(1);
        student.setName("rajveer");
        return "Good morning "+student;
    }
}
