package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.model.Pessoa;

@Service
public class PessoaServiceImp implements PessoaService{

	@Autowired
	private Repository repository;
	
	@Override
	public Pessoa add(Pessoa pessoa) {
		return this.repository.save(pessoa);
	}

	@Override
	public Pessoa listOne(long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public List<Pessoa> listAll() {
		return this.repository.findAll();
	}
	
	@Override
	public void delete(long id) {
		this.repository.deleteById(id);	
	}

	@Override
	public Pessoa update(Pessoa pessoa) {
		return this.repository.saveAndFlush(pessoa);
	}

	@Override
	public List<Pessoa> ListAllPagination() {
		Pageable page = PageRequest.of(0, 5);
		return this.repository.findAll(page).getContent();
	}
}
