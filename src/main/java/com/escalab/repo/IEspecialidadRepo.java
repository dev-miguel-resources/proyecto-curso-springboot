package com.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escalab.model.Especialidad;

//@Repository
public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer>{
	
}
