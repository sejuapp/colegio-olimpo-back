package com.runt.pruebarunt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runt.pruebarunt.model.ProfesorEntity;
import com.runt.pruebarunt.repository.IProfesorRepository;

@Service
public class ProfesorService {
	
	@Autowired
	private IProfesorRepository iProfesorDao;
	
	@Transactional(readOnly = true)
	public List<ProfesorEntity> findAll() {
		return (List<ProfesorEntity>) this.iProfesorDao.findAll();
	}
}
