package com.appweb.crud.estudiante.crud_estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.appweb.crud.estudiante.crud_estudiante.entity.Student;
import com.appweb.crud.estudiante.crud_estudiante.repository.StudentRepository;

@SpringBootApplication
public class CrudEstudianteApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudEstudianteApplication.class, args);
	}

	@Autowired StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Anthony Davis", "Yeren Martinez", "ayerenmartinez@hotmail.com");
		Student student2 = new Student("Anthony Ismael", "Yeren Guerrero", "ayerenguerrero@hotmail.com");
		Student student3 = new Student("Davis Josue", "Yeren Guerrero", "dyerenguerrero@hotmail.com");
		Student student4 = new Student("Kerem Juliana", "Yeren Guerrero", "kyerenguerrero@hotmail.com");
		Student student5 = new Student("Gladys Juliana", "Guerrero Santiago", "gguerrerosantiago@hotmail.com");
		repository.save(student1);
		repository.save(student2);
		repository.save(student3);
		repository.save(student4);
		repository.save(student5);
		 */
	}

}
