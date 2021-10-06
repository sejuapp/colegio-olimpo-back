package com.runt.pruebarunt.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.runt.pruebarunt.dto.AsignaturaCursoDto;
import com.runt.pruebarunt.service.GenericAccesDataService;

@Repository
public class AsignaturaDao  implements Serializable{
	private static final long serialVersionUID = -7398600377508343735L;
	
	@Autowired
	private GenericAccesDataService genericAccesDataService;

	public List<AsignaturaCursoDto> findAsignaturaByProfesor(Long profesorId) {
		 
		String sql = new StringBuilder().append("")
				.append("SELECT a.id, a.profesor_id as profesorId, a.nombre, a.curso_id as cursoId, c.grado, c.salon ")
				.append("FROM asignatura a ")
				.append("LEFT JOIN curso c ON c.id = a.curso_id ")
				.append("WHERE a.profesor_id =:profesorId ")
				.append("ORDER BY a.nombre, c.grado ASC, c.salon ASC ")
				.toString();
		MapSqlParameterSource np = new MapSqlParameterSource();
		np.addValue("profesorId", profesorId);
		
		return genericAccesDataService.namedParameterQuery(sql, np, AsignaturaCursoDto.class);
		
	}
}
