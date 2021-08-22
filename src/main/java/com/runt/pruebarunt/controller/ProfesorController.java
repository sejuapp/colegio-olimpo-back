package com.runt.pruebarunt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.pruebarunt.model.ProfesorEntity;
import com.runt.pruebarunt.service.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;

	@GetMapping(path = "/find-all")
	public List<ProfesorEntity> findAll() {
		return this.profesorService.findAll();
	}
}
