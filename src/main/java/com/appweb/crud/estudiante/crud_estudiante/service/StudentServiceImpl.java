package com.appweb.crud.estudiante.crud_estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appweb.crud.estudiante.crud_estudiante.entity.Student;
import com.appweb.crud.estudiante.crud_estudiante.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> listStudents() {
        return repository.findAll();
    }

}
