package com.runt.pruebarunt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class DescriptivoNombre implements Serializable{
	private static final long serialVersionUID = -1490513413190150484L;

	@Column(name = "nombre")
	private String nombre;
	
}
