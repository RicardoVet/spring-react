package br.com.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Formulario;
import br.com.service.FormularioService;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(allowCredentials = "true")
public class FormularioResource {

	@Autowired
	private FormularioService formularioService;
	
	@PostMapping("/save")
	public void salvar(@RequestBody Formulario formulario) {
		this.formularioService.salvar(formulario);
	}
	
	@GetMapping("/disciplinas")
	@ResponseBody
	public ResponseEntity<List<String>> disciplinas() {
		List<String> disciplinas = new ArrayList<>();
		disciplinas.add("Calculo");
		disciplinas.add("Geometria");
		disciplinas.add("Optativa");
		disciplinas.add("Teste");
		return ResponseEntity.ok(disciplinas);
	}
	
	@GetMapping("/form/{codigo}")
	@ResponseBody
	public ResponseEntity<Formulario>getForm(@PathVariable String codigo){
		Formulario form = formularioService.buscarFormulario(codigo);
		return ResponseEntity.ok(form);
	}
}
