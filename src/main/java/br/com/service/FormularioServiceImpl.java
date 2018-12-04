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
		if(formulario.getId() == 0) {
			Formulario formularioUpdate = repo.checkCodigo(formulario.getCodigo());
			if(formularioUpdate!=null) {
				formulario.setId(formularioUpdate.getId());
			}
		}
		repo.save(formulario);
	}

	@Override
	public Formulario buscarFormulario(Integer codigo) {
		return repo.findByCodigo(codigo);
	}
}
