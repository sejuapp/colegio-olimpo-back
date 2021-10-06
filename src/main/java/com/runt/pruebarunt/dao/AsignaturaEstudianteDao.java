package com.runt.pruebarunt.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.runt.pruebarunt.converter.AsignaturaEstudianteDtoRowMapper;
import com.runt.pruebarunt.dto.AsignaturaEstudianteDto;
import com.runt.pruebarunt.service.GenericAccesDataService;

@Repository
public class AsignaturaEstudianteDao implements Serializable {
	private static final long serialVersionUID = -628374085966534311L;

	@Autowired
	private GenericAccesDataService genericAccesDataService;

	
	public List<AsignaturaEstudianteDto> findEstudiantesPorAsignatura(Long pAsignaturaId) {
		String sql = new StringBuilder().append("")
		.append("SELECT ae.id, e.id as estudianteId, e.nombre as estudianteNombre ")
		.append("FROM asignatura_estudiante ae ")
		.append("LEFT JOIN estudiante e ON e.id = ae.estudiante_id ")
		.append("WHERE asignatura_id = :pAsignaturaId ")
		.toString();
		MapSqlParameterSource np = new MapSqlParameterSource();
		np.addValue("pAsignaturaId", pAsignaturaId);
		
		return genericAccesDataService.namedParameterQuery(sql, np, AsignaturaEstudianteDto.class);
		
	}
}
