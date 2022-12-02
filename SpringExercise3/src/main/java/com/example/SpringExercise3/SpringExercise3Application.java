package com.example.SpringExercise3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExercise3Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringExercise3Application.class, args);

		PersonaRepository personaRepository = context.getBean(PersonaRepository.class);

		Persona persona = new Persona("Matias", "Pavón", 35258515, "matiaspavon5@hotmail.com");

		personaRepository.save(persona);

		System.out.println(personaRepository.findAll());

	}

}
