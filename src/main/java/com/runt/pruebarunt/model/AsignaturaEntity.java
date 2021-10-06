package com.runt.pruebarunt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "asignatura")
public class AsignaturaEntity extends DescriptivoNombre implements Serializable {
	private static final long serialVersionUID = 7110428473687285976L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "curso_id",referencedColumnName = "id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	//@JsonBackReference
	private CursoEntity curso;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profesor_id", referencedColumnName = "id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	//@JsonBackReference
	private ProfesorEntity profesor;

	@Override
	public String toString() {
		return "AsignaturaEntity(id=" + this.getId() + ", curso=" + this.getCurso() + ", profesor=" + this.getProfesor()
				+ " )";
	}
}
