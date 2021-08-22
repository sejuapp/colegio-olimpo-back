package com.runt.pruebarunt.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AsignaturaEstudianteDto implements Serializable{
	private static final long serialVersionUID = -1297631563971377765L;
	
	private Long id;
	
	private Long estudianteId;
	private String estudianteNombre;
	
	
}
