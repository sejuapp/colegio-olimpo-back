package com.runt.pruebarunt.converter;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperGeneric<T> implements RowMapper<T> {
	private Class<T> classMapper;
	

	public RowMapperGeneric(Class<T> classMapper) {
		this.classMapper = classMapper;
	}

	@Override
	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		T instanceMapper = null;
		
		Field[] fields = classMapper.getDeclaredFields();
		
		try {
			
			instanceMapper = classMapper.getDeclaredConstructor().newInstance();

			for (Field field : fields) {

				try {
					rs.findColumn(field.getName());
				} catch (Exception e) {
					continue;
				}
				
				boolean accessFlag = field.trySetAccessible();
				field.setAccessible(true);
				String value = rs.getString(field.getName());
				value = value == null ? "" : value;
				setFieldValue(instanceMapper, field, value);
				field.setAccessible(accessFlag);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return instanceMapper;
	}
	
	public static void setFieldValue(Object form, Field field, String value) {

        String elemType = field.getType().toString();

        if (elemType.indexOf("boolean") != -1||elemType.indexOf("Boolean") != -1) {
            try {
                field.set(form, Boolean.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("byte") != -1||elemType.indexOf("Byte") != -1) {
            try {
                field.set(form, Byte.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("char") != -1||elemType.indexOf("Character") != -1) {
            try {
                field.set(form, Character.valueOf(value.charAt(0)));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("double") != -1||elemType.indexOf("Double") != -1) {
            try {
                field.set(form, Double.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("float") != -1||elemType.indexOf("Float") != -1) {
            try {
                field.set(form, Float.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("int") != -1||elemType.indexOf("Integer") != -1) {
            try {
                field.set(form, Integer.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("long") != -1||elemType.indexOf("Long") != -1) {
            try {
                field.set(form, Long.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (elemType.indexOf("short") != -1||elemType.indexOf("Short") != -1) {
            try {
                field.set(form, Short.valueOf(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else {
            try {
                field.set(form, (Object) value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
