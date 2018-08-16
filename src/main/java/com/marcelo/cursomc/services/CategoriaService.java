package com.marcelo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.cursomc.domain.Categoria;
import com.marcelo.cursomc.repositories.CategoriaRepository;
import com.marcelo.cursomc.services.exception.ObjectNotFoundException;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	/**vamos lançar uma excecao, caso o id não exista */
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
			if (obj == null) {
				throw new  ObjectNotFoundException("Objeto não encontradpo! id:" + id
						+ ", Tipo: " + Categoria.class.getName());
			}
		
		return obj;
		
	}
}
