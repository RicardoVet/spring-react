package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Formulario;

@Service
public class FormularioServiceImpl implements FormularioService {

	@Autowired
	private FormularioRepository repo;
	
	@Override
	public void salvar(Formulario formulario) {
		Long id = repo.checkCodigo(formulario.getCodigo());
		if(id!=null) {
			formulario.setBase(id);
		}
		repo.save(formulario);
	}

	@Override
	public Formulario buscarFormulario(Integer codigo) {
		return repo.findByCodigo(codigo);
	}
}
