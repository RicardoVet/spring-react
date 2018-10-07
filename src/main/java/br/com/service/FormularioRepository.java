package br.com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.model.Formulario;

public interface FormularioRepository extends JpaRepository<Formulario, Long>{

	@Query("select f.id from Formulario f where f.codigo = ?1 group by f.codigo")
	Long checkCodigo(String codigo);
	
	@Query("select f from Formulario f where f.codigo = ?1 group by f.codigo")
	Formulario findByCodigo(String codigo);
}
