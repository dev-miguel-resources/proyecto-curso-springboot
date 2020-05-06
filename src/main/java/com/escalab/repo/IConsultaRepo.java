package com.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escalab.model.Consulta;

//@Repository
public interface IConsultaRepo extends JpaRepository<Consulta, Integer>{
	
}
