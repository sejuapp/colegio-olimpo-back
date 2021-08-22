package com.runt.pruebarunt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "asignatura_estudiante")
public class AsignaturaEstudianteEntity implements Serializable {
	private static final long serialVersionUID = 3606179966869901273L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "estudiante_id")
	private EstudianteEntity estudiante;
	
	@ManyToOne
	@JoinColumn(name = "asignatura_id")
	private AsignaturaEntity asignatura;

}
