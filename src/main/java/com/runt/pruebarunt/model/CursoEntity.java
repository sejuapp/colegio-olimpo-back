package com.runt.pruebarunt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "curso")
public class CursoEntity implements Serializable {
	private static final long serialVersionUID = 4213539096348267165L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "grado")
	private Integer grado;

	@Column(name = "salon")
	private String salon;

	@ManyToOne
	@JoinColumn(name = "colegio_id")
	private ColegioEntity colegio;

//	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	List<AsignaturaEntity> asignaturas;

	@Override
	public String toString() {
		return "CursoEntity [id=" + id + ", grado=" + grado + ", salon=" + salon + ", colegio=" + colegio + "]";
	}

}
