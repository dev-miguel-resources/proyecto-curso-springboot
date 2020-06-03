package com.escalab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.escalab.model.Menu;
import com.escalab.repo.IMenuRepo;
import com.escalab.service.IMenuService;

public class MenuServiceImpl implements IMenuService  {
	
	@Autowired
	private IMenuRepo repo;
	
	@Override
	public Menu registrar(Menu menu) {
		return repo.save(menu);
	}
	
	@Override
	public Menu modificar(Menu menu) {
		return repo.save(menu);	
	}
	
	@Override
	public boolean eliminar(Integer idMenu) {
		repo.deleteById(idMenu);
		return true;
	}
	
	@Override
	public Menu leerPorId(Integer idMenu) {
		Optional<Menu> op = repo.findById(idMenu);
		return op.isPresent() ? op.get() : new Menu();
	}
	
	@Override
	public List<Menu> listar() {
		return repo.findAll();
	}

}
