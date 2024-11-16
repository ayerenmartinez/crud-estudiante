package com.appweb.crud.estudiante.crud_estudiante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.appweb.crud.estudiante.crud_estudiante.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping({"/students","/"})
    public String listStudents(Model model) {
        model.addAttribute("students", service.listStudents());
        return "students";
    }
    
}
