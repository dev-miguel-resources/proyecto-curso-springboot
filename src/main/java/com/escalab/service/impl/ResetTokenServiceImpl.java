package com.escalab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.escalab.model.ResetToken;
import com.escalab.repo.IResetTokenRepo;
import com.escalab.service.IResetTokenService;

public class ResetTokenServiceImpl implements IResetTokenService {
	
	@Autowired
	private IResetTokenRepo repo;
	
	@Override
	public ResetToken findByToken(String token) {
		return repo.findByToken(token);
	}
	
	@Override
	public void guardar(ResetToken token) {
		repo.save(token);
	}
	
	@Override
	public void eliminar(ResetToken token) {
		repo.delete(token);
	}

}
