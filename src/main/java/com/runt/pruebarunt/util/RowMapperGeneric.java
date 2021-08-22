package com.runt.pruebarunt.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperGeneric<T> implements RowMapper<T> {
	private final Class<T> typeClassMapper;

	public RowMapperGeneric(Class<T> typeClassMapper) {
		this.typeClassMapper = typeClassMapper;
	}

	@Override
	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		T intanceMapper = null;

		try {
			intanceMapper = this.typeClassMapper.getConstructor().newInstance();
		} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException
				| IllegalAccessException | InstantiationException e) {
			// e.printStackTrace();
			throw new RuntimeException("No se pudo crear la instancia del Mapper", e);
		}
		
		int columnas = rs.getMetaData().getColumnCount();
		
		for (int i = 0; i < columnas; i++) {
			String nameColum = rs.getMetaData().getColumnLabel(i + 1).trim();
			if( Objects.isNull(nameColum) || nameColum.length() < 1  ) {
				nameColum = rs.getMetaData().getColumnName(i + 1).trim();
			}
			
			Object resObject = rs.getObject(i + 1);
			
			if( Objects.nonNull(resObject) ) {
				
			}
		}

		return intanceMapper;
	}
	
	

}
