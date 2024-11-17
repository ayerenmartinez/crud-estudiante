package com.appweb.crud.estudiante.crud_estudiante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.appweb.crud.estudiante.crud_estudiante.entity.Student;
import com.appweb.crud.estudiante.crud_estudiante.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping({"/students","/"})
    public String listStudents(Model model) {
        model.addAttribute("students", service.listStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "createStudent";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }
    
    @GetMapping("/students/update/{id}")
    public String viewFormUpdate(@PathVariable("id") Long id, Model model) {
        model.addAttribute("student", service.getStudentById(id));
        return "updateStudent";
    }
    
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable("id") Long id, @ModelAttribute("student") Student student, Model model) {
        Student existingStudent = service.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setName(student.getName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        service.updateStudent(existingStudent);
        return "redirect:/students";
    }
    
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }
    
    
}
