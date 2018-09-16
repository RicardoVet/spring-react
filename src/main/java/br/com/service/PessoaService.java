package br.com.service;

import java.util.List;

import br.com.model.Pessoa;

public interface PessoaService {

	public Pessoa add(Pessoa pessoa);
	
	public Pessoa listOne(long id);
	
	public List<Pessoa> listAll();
	
	public List<Pessoa> ListAllPagination(); 
	
	public void delete(long id);
	
	public Pessoa update(Pessoa pessoa);
}
