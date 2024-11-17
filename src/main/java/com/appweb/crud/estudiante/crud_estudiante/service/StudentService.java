package com.appweb.crud.estudiante.crud_estudiante.service;

import java.util.List;

import com.appweb.crud.estudiante.crud_estudiante.entity.Student;

public interface StudentService {

    public List<Student> listStudents();

    public Student saveStudent(Student student);

    public Student getStudentById(Long id);

    public Student updateStudent(Student student);

    public void deleteStudent(Long id);
}
