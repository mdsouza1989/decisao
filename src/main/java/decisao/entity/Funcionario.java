package decisao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@JsonIgnore
	@OneToMany(mappedBy= "funcionario")
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "setor_id")
	private Setor setor;
	
	@JsonIgnore
	@OneToMany(mappedBy= "funcionario")
	private List<Livro> livros = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy= "funcionario")
	private List<Documento> documentos = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy= "funcionario")
	private List<Devolucao> devolucoes = new ArrayList<>();
	
	@ManyToMany(mappedBy= "funcionarios")
	private List<Empresa> empresas = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy = "funcionario")
	private Endereco endereco;

	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, String email, Setor setor) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.setor = setor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public List<Devolucao> getDevolucoes() {
		return devolucoes;
	}

	public void setDevolucoes(List<Devolucao> devolucoes) {
		this.devolucoes = devolucoes;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
