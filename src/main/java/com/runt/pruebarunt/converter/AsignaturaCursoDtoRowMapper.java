package com.runt.pruebarunt.converter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.runt.pruebarunt.dto.AsignaturaCursoDto;

public class AsignaturaCursoDtoRowMapper implements RowMapper<AsignaturaCursoDto> {

	@Override
	public AsignaturaCursoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		AsignaturaCursoDto dto = new AsignaturaCursoDto();
		
		dto.setId(rs.getLong("id"));
		dto.setNombre(rs.getString("nombre"));
		dto.setCursoId(rs.getLong("curso_id"));
		dto.setGrado(rs.getInt("grado"));
		dto.setSalon(rs.getString("salon"));
		dto.setProfesorId(rs.getLong("profesor_id"));
		
		return dto;
	}

}
