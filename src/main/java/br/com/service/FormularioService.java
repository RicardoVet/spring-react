package br.com.service;

import br.com.model.Formulario;

public interface FormularioService {

	void salvar(Formulario formulario);
	
	Formulario buscarFormulario(String codigo);
	
}
