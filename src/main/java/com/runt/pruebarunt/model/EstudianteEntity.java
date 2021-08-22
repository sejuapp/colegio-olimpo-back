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
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "estudiante")
public class EstudianteEntity extends DescriptivoNombre implements Serializable {
	private static final long serialVersionUID = -495682588484254135L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Override
	public String toString() {
		return "EstudianteEntity(id=" + this.getId() + ", nombre=" + this.getNombre() + ")";
	}

}
