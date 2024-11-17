package com.appweb.crud.estudiante.crud_estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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

    @Override
    public Student saveStudent(Student student) {
      return repository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
      return repository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
      return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
      repository.deleteById(id);
    }

}
