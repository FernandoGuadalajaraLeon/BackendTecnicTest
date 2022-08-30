package com.test.exam.app.entities;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Asignacion {
	
	private Long idAsignacion;
	
	private Examen examen;
	
	private Alumno alumno;
	
	private Date fechaExamen;
	
	private int calificacion;

}
