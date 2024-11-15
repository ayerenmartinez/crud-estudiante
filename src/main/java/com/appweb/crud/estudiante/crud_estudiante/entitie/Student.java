package com.appweb.crud.estudiante.crud_estudiante.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",nullable = false,length = 50)
    private String nombre;

    @Column(name = "apellidos",nullable = false, length = 50)
    private String apellidos;

    @Column(name = "email",nullable = false, length = 50, unique = true)
    private String email;

    public Student() {
    }

    public Student(Long id, String nombre, String apellidos, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    
}
