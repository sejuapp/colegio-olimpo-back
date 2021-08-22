package com.runt.pruebarunt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runt.pruebarunt.dao.AsignaturaDao;
import com.runt.pruebarunt.dao.AsignaturaEstudianteDao;
import com.runt.pruebarunt.dto.AsignaturaCursoDto;

@Service
public class AsignaturaService {

	
	@Autowired
	private AsignaturaDao asignaturaDao;
	
	@Autowired
	private AsignaturaEstudianteDao asignaturaEstudianteDao;


	@Transactional(readOnly = true)
	public List<AsignaturaCursoDto> findAsignaturaByProfesor(Long profesorId) {
		
		List<AsignaturaCursoDto> lst =  this.asignaturaDao.findAsignaturaByProfesor(profesorId);
		lst.forEach(item-> {
			item.setLstEstudiantes(this.asignaturaEstudianteDao.findEstudiantesPorAsignatura(item.getId()));
		});
		
		return lst;
	}

}
