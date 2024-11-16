package com.appweb.crud.estudiante.crud_estudiante.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appweb.crud.estudiante.crud_estudiante.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
