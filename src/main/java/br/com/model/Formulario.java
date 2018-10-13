package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Formulario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private long id;

	@Getter
	@Setter
	private String curso;
	
	@Getter
	@Setter
	private String departamento;
	
	@Getter
	@Setter
	@Column(unique=true)
	private int codigo;
	
	@Getter
	@Setter
	private String disciplina;
	
	@Getter
	@Setter
	private String seriacao;
	
	@Getter
	@Setter
	private String carga;
	
	@Getter
	@Setter
	private String creditos;
	
	@Getter
	@Setter
	private String requisitos;
	
	@Getter
	@Setter
	private boolean anual;
	
	@Getter
	@Setter
	private boolean semestral;
	
	@Getter
	@Setter
	private boolean optativa;
	
	@Getter
	@Setter
	private boolean obrigatoria;
	
	@Getter
	@Setter
	private int numeroDeAlunos;
	
	@Getter
	@Setter
	private int aulasTeoricas;
	
	@Getter
	@Setter
    private int aulasPraticas;
    
	@Getter
	@Setter
    private int aulasTeoricoPraticas;
    
    @Getter
    @Setter
    private String outras;
    
    @Getter
	@Setter
    private String objetivos;
    
    @Getter
	@Setter
    private String conteudo;
    
    @Getter
	@Setter
    private Long base;

}
