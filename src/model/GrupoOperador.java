package model;

import java.util.ArrayList;
import java.util.List;

public class GrupoOperador {
	
	private Long id;
	
	private String nome;
	
	private Double valorOcorrencia;
	
	private Boolean atendimentoExterno;
	
	private List<Tecnico> tecnico;
	
	public GrupoOperador(String nome, Double valorOcorrencia, Boolean atendimentoExterno) {
		this.tecnico = new ArrayList<Tecnico>();
		this.setNome(nome);
		this.setValorOcorrencia(valorOcorrencia);
		this.setAtendimentoExterno(atendimentoExterno);
	}
	
	public void adicioanrTecnico (Tecnico tecnico){
		this.tecnico.add(tecnico);
	}

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

	public Double getValorOcorrencia() {
		return valorOcorrencia;
	}

	public void setValorOcorrencia(Double valorOcorrencia) {
		this.valorOcorrencia = valorOcorrencia;
	}

	public List<Tecnico> getTecnico() {
		return tecnico;
	}

	public void setTecnico(List<Tecnico> tecnico) {
		this.tecnico = tecnico;
	}
	public Boolean getAtendimentoExterno() {
		return atendimentoExterno;
	}
	public void setAtendimentoExterno(Boolean atendimentoExterno) {
		this.atendimentoExterno = atendimentoExterno;
	}
	
	
}
