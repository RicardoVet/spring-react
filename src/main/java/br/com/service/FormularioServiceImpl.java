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
<<<<<<< HEAD
		String id = repo.checkCodigo(formulario.getCodigo());
		if(id==null) {
			repo.save(formulario);
=======
		if(formulario.getId() == 0) {
			Formulario formularioUpdate = repo.checkCodigo(formulario.getCodigo());
			if(formularioUpdate!=null) {
				formulario.setId(formularioUpdate.getId());
			}
>>>>>>> c3c79c806f0fa961d8b847d84b349f88981b608a
		}
	}

	@Override
	public Formulario buscarFormulario(String codigo) {
		return repo.findByCodigo(codigo);
	}
}
