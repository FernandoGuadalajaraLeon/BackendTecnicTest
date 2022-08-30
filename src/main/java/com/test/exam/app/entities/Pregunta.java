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
public class Pregunta {
	
	private Long idPregunta;
	
	private String pregunta;
	
	private List<Respuesta> respuestas;
	
	//private Map<String, String> respuestas;			//<azul, 20> , <verde,0>
	
	private int puntaje;
	
}
