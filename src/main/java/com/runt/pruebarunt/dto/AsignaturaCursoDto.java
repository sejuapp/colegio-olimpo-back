package com.runt.pruebarunt.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AsignaturaCursoDto implements Serializable {
	private static final long serialVersionUID = 5283718664441782368L;
	private Long id;
	private String nombre;
	
	private Long cursoId;
	private Integer grado;
	private String salon;
	
	private Long profesorId;
	
	private List<AsignaturaEstudianteDto> lstEstudiantes;
}
