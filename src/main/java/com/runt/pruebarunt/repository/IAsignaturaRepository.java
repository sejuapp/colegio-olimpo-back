package com.runt.pruebarunt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.runt.pruebarunt.model.AsignaturaEntity;

@Repository
public interface IAsignaturaRepository extends JpaRepository<AsignaturaEntity, Long> {

	@Query(nativeQuery = false, value = ""
			+ "SELECT a " 
			+ "FROM AsignaturaEntity a " 
			+ "LEFT JOIN FETCH a.profesor p "
			+ "WHERE p.id = :profesorId ")
	List<AsignaturaEntity> buscarAsignaturaByProfesor(@Param("profesorId") Long profesorId);
	
	List<AsignaturaEntity> findByProfesorId(Long id);
	
}
