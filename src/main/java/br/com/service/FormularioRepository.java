package br.com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.model.Formulario;

public interface FormularioRepository extends JpaRepository<Formulario, Long>{

<<<<<<< HEAD
	@Query("select f.id from Formulario f where f.codigo = ?1")
	String checkCodigo(String codigo);
=======
	@Query("select f from Formulario f where f.codigo = ?1")
	Formulario checkCodigo(Integer codigo);
>>>>>>> c3c79c806f0fa961d8b847d84b349f88981b608a
	
	@Query("select f from Formulario f where f.codigo = ?1")
	Formulario findByCodigo(String codigo);
}
