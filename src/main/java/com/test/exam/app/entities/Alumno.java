package com.test.exam.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alumno {
	
	private Long idAlumno;
	
	private String nombre;
	
	private int edad;
	
	private String ciudad;
	
	private String zonaHoraria;

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad
				+ ", zonaHoraria=" + zonaHoraria + "]";
	}
}
