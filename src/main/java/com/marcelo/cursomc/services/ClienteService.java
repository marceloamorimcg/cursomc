package com.marcelo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.cursomc.domain.Cliente;
import com.marcelo.cursomc.repositories.ClienteRepository;
import com.marcelo.cursomc.services.exception.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	/**vamos lançar uma excecao, caso o id não exista */
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
			if (obj == null) {
				throw new  ObjectNotFoundException("Objeto não encontradpo! id:" + id
						+ ", Tipo: " + Cliente.class.getName());
			}
		
		return obj;
		
	}
}
