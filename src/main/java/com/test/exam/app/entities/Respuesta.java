package com.test.exam.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Respuesta {
	
	private Long idRespuesta;
	
	private Pregunta pregunta;
	
	private char opcion;
	
	private String valor;
	
	private boolean correcto;

}
