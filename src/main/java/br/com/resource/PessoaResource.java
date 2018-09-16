package br.com.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.model.Pessoa;
import br.com.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(allowCredentials = "true")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping("/save")
	@ResponseBody
	public ResponseEntity<Pessoa> add(@RequestBody Pessoa pessoa){
		Pessoa addPessoa = this.pessoaService.add(pessoa);
		URI uri =  ServletUriComponentsBuilder.
				fromCurrentContextPath().
				path("/pessoa/list/{id}").
				buildAndExpand(addPessoa.getId()).
				toUri();
		return addPessoa == null?
				ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build()
				:ResponseEntity.created(uri).body(addPessoa);
	}
	
	@GetMapping("/list/{id}")
	@ResponseBody
	public ResponseEntity<Pessoa> findOne(@PathVariable long id){
		Pessoa pessoaFind = this.pessoaService.listOne(id);
		return ResponseEntity.ok(pessoaFind);
	}
	
	@GetMapping("/list")
	@ResponseBody
	public ResponseEntity<List<Pessoa>> findAll(){
		return ResponseEntity.ok(this.pessoaService.listAll()); 
	}
	
	@GetMapping("/listPage")
	@ResponseBody
	public ResponseEntity<List<Pessoa>> findAllPagination() {
		return ResponseEntity.ok(this.pessoaService.ListAllPagination());
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		this.pessoaService.delete(id);
	}
	
	@PutMapping("/update/{id}")
	@ResponseBody
	public ResponseEntity<Pessoa> update(@PathVariable long id, @RequestBody Pessoa pessoaAtualizada, HttpServletResponse response) {
		Pessoa pessoa = this.pessoaService.listOne(id);
		BeanUtils.copyProperties(pessoaAtualizada, pessoa, "id");
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().
				path("/pessoa/list/{id}").
				buildAndExpand(pessoa.getId()).
				toUri();
		response.setHeader("location", uri.toString());
		pessoaAtualizada = this.pessoaService.update(pessoa);
		return ResponseEntity.ok(pessoaAtualizada);
	}
}
