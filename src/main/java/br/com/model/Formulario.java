package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Formulario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Version
	private Integer versao;

	private String curso;
	
	private String departamento;
	
	private String codigo;
	
	private String disciplina;
	
	private String seriacao;
	
	private String carga;
	
	private String creditos;
	
	private String requisitos;
	
	private boolean anual;
	
	private boolean semestral;
	
	private boolean optativa;
	
	private boolean obrigatoria;
	
	private int numeroDeAlunos;
	
	private int aulasTeoricas;
	
    private int aulasPraticas;
    
    private int aulasTeoricoPraticas;
    
    private String outras;
    
    private String objetivos;
    
    private String conteudo;
    
    private Long base;

	public Long getBase() {
		return base;
	}

	public void setBase(Long base) {
		this.base = base;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isAnual() {
		return anual;
	}

	public void setAnual(boolean anual) {
		this.anual = anual;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getSeriacao() {
		return seriacao;
	}

	public void setSeriacao(String seriacao) {
		this.seriacao = seriacao;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public boolean isSemestral() {
		return semestral;
	}

	public void setSemestral(boolean semestral) {
		this.semestral = semestral;
	}

	public boolean isOptativa() {
		return optativa;
	}

	public void setOptativa(boolean optativa) {
		this.optativa = optativa;
	}

	public boolean isObrigatoria() {
		return obrigatoria;
	}

	public void setObrigatoria(boolean obrigatoria) {
		this.obrigatoria = obrigatoria;
	}

	public int getNumeroDeAlunos() {
		return numeroDeAlunos;
	}

	public int getAulasTeoricas() {
		return aulasTeoricas;
	}

	public void setAulasTeoricas(int aulasTeoricas) {
		this.aulasTeoricas = aulasTeoricas;
	}

	public int getAulasPraticas() {
		return aulasPraticas;
	}

	public void setAulasPraticas(int aulasPraticas) {
		this.aulasPraticas = aulasPraticas;
	}

	public int getAulasTeoricoPraticas() {
		return aulasTeoricoPraticas;
	}

	public void setAulasTeoricoPraticas(int aulasTeoricoPraticas) {
		this.aulasTeoricoPraticas = aulasTeoricoPraticas;
	}

	public String getOutras() {
		return outras;
	}

	public void setOutras(String outras) {
		this.outras = outras;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public void setNumeroDeAlunos(int numeroDeAlunos) {
		this.numeroDeAlunos = numeroDeAlunos;
	}
}
