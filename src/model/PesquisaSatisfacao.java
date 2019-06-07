package model;

import model.enums.NivelSatisfacao;

public class PesquisaSatisfacao {
	
	private Long id;
	
	private NivelSatisfacao nivelSatisfacao;
	
	private String comentarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NivelSatisfacao getNivelSatisfacao() {
		return nivelSatisfacao;
	}

	public void setNivelSatisfacao(NivelSatisfacao nivelSatisfacao) {
		this.nivelSatisfacao = nivelSatisfacao;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
}
