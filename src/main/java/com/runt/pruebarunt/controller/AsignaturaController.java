package com.runt.pruebarunt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.pruebarunt.dto.AsignaturaCursoDto;
import com.runt.pruebarunt.service.AsignaturaService;

@RestController
@RequestMapping("/asignatura")
public class AsignaturaController {
	
	@Autowired
	private AsignaturaService asignaturaService;
	

	@GetMapping(path = "/find-by-profesor/{profesorId}")
	public List<AsignaturaCursoDto> findByProfesor(@PathVariable Long profesorId) {
		return this.asignaturaService.findAsignaturaByProfesor( profesorId);
	}
}
