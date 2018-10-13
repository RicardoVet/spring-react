package br.com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.model.Formulario;

public interface FormularioRepository extends JpaRepository<Formulario, Long>{

	@Query("select f.id from Formulario f where f.codigo = ?1")
	Long checkCodigo(Integer codigo);
	
	@Query("select f from Formulario f where f.codigo = ?1")
	Formulario findByCodigo(Integer codigo);
}
