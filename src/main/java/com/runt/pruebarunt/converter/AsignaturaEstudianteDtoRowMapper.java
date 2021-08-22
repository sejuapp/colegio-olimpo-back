package com.runt.pruebarunt.converter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.runt.pruebarunt.dto.AsignaturaEstudianteDto;

public class AsignaturaEstudianteDtoRowMapper implements RowMapper<AsignaturaEstudianteDto>{


	@Override
	public AsignaturaEstudianteDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		AsignaturaEstudianteDto dto = new AsignaturaEstudianteDto();
		dto.setId(rs.getLong("id"));
		dto.setEstudianteId(rs.getLong("estudianteId"));
		dto.setEstudianteNombre(rs.getString("estudianteNombre"));
		return dto;
	}

}
