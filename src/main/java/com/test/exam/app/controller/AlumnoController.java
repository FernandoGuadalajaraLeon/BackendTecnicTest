package com.test.exam.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.app.entities.Alumno;

@RestController
public class AlumnoController {
	
	@GetMapping("alumno")
	public String createAlumno() {
		
		Alumno alumno = new Alumno();
		alumno.setNombre("fer");
		alumno.setEdad(25);
		alumno.setCiudad("tlax");
		alumno.setZonaHoraria("centro");
		return alumno.toString();
	}

}
