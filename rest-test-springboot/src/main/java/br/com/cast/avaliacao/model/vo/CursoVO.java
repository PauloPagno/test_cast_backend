package br.com.cast.avaliacao.model.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class CursoVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private long id;
	private String descricao;	
	@Temporal(TemporalType.DATE)
	private Date datainicio;	
	@Temporal(TemporalType.DATE)
	private Date datafim;	
	private int quantidadeAlunos;	
	private String categoria;

	public CursoVO() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date string) {
		this.datainicio = string;
	}

	public Date getDatafim() {
		return datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((datafim == null) ? 0 : datafim.hashCode());
		result = prime * result + ((datainicio == null) ? 0 : datainicio.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + quantidadeAlunos;
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
		CursoVO other = (CursoVO) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (datafim == null) {
			if (other.datafim != null)
				return false;
		} else if (!datafim.equals(other.datafim))
			return false;
		if (datainicio == null) {
			if (other.datainicio != null)
				return false;
		} else if (!datainicio.equals(other.datainicio))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (quantidadeAlunos != other.quantidadeAlunos)
			return false;
		return true;
	}

	
}
