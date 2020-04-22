package br.com.massenan.eventos.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Class <code>Evento</code>
 * 
 * Define objeto de negócio para registrar eventos.
 * 
 * @author massenandev
 * @version 1.0.0
 * @since 2020-04-18
 */

@Entity
@Table
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	@Column(name = "local", nullable = false, unique = true, length = 100)
	private String local;

	@Column(name = "organizacao", nullable = false, unique = true, length = 60)
	private String organizacao;

	@Column(name = "data", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime data;
	

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((organizacao == null) ? 0 : organizacao.hashCode());
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
		Evento other = (Evento) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (organizacao == null) {
			if (other.organizacao != null)
				return false;
		} else if (!organizacao.equals(other.organizacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", local=" + local + ", organizacao=" + organizacao + ", data="
				+ data + "]";
	}

}
