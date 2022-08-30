package com.test.exam.app.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Examen {
	
	private Long idExamen;
	
	private String nombre;
	
	private List<Pregunta> preguntas;

}
