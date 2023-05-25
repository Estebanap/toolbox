package com.toolbox.servicio;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.toolbox.generico.GenericServiceImp;

import com.toolbox.modelo.Articulo;
import com.toolbox.repositorio.RepositorioArticulo;




@Service
public class ArticuloServicioImp extends GenericServiceImp<Articulo, Integer> implements ArticuloServicio{

	@Autowired
	public RepositorioArticulo repositorioArticulo;

	@Override
	public Articulo select(String categoria, String nombre) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'select'");
	}

	@Override
	public Articulo selectPorID(int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'selectPorID'");
	}

	@Override
	public CrudRepository<Articulo, Integer> getDao() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getDao'");
	}
	

	
}
