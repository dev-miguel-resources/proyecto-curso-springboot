package com.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escalab.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{
	
}
