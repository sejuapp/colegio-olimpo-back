package com.runt.pruebarunt.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.runt.pruebarunt.converter.RowMapperGeneric;

@Service
public class GenericAccesDataService  implements Serializable {
	private static final long serialVersionUID = -1013978617637435992L;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public <T> List<T> namedParameterQuery(String sql, MapSqlParameterSource np, Class<T> clazz ) {	
		return namedParameterJdbcTemplate.query(sql, np, new RowMapperGeneric<>(clazz));
	}
}
