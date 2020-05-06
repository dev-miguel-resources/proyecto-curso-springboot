package com.escalab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escalab.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{
	
}
