package com.runt.pruebarunt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "colegio")
public class ColegioEntity extends DescriptivoNombre implements Serializable {
	private static final long serialVersionUID = -8970931512114218886L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Override
	public String toString() {
		return "ColegioEntity(id=" + this.getId() + ", nombre=" + this.getNombre() + ")";
	}
}
