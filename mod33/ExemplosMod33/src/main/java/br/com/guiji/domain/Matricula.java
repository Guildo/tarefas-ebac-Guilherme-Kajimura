package br.com.guiji.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATRI_SEQ")
	@SequenceGenerator(name="MATRI_SEQ", sequenceName="SQ_MATRICULA", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "DATA_MATRICULA", nullable = false)
	private Instant dataMatricula;
	
	@Column(name = "VALOR", nullable = false)
	private Double valor;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "ID_CURSO_FK",
		foreignKey = @ForeignKey(name = "FK_CURSO_MATRICULA"),
		referencedColumnName = "ID", nullable = false
	)
	private Curso curso;
	
	@OneToOne
	@JoinColumn(name = "ID_ALUNO_FK",
		foreignKey = @ForeignKey(name = "FK_ALUNO_MATRICULA"),
		referencedColumnName = "ID", nullable = false
	)	
	private Aluno aluno;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Instant getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Instant dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	

}
