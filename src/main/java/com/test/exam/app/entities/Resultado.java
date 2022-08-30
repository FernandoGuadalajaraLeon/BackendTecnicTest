package com.test.exam.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Resultado {
	
	private Long idResutado;
	
	private Asignacion asignacion;
	
	//lista Respuestas -> pregunta, respuesta, puntaje
	
	private Pregunta pregunta;
	
	private String respuesta;
	
	private int puntaje;

}
