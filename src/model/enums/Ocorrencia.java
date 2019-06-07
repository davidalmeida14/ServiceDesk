package model.enums;

import java.time.LocalDateTime;

import model.Categoria;
import model.GrupoOperador;
import model.Tecnico;

public class Ocorrencia {
	
	private Long id;
	private String descricao;
	private LocalDateTime dataOcorrencia;
	private LocalDateTime dataAgendamento;
	private NivelUrgencia nivelUrgencia;
	// Em horas
	private int TempoAtendimento;
	private Categoria categoria;
	private GrupoOperador grupoOperador;
	private Tecnico tecnico;
	
	
	public Ocorrencia(String descricao, NivelUrgencia nivelUrgencia, Integer tempoAtendimento, Categoria categoria, Tecnico tecnico, GrupoOperador grupoOperador) {
		this.setDescricao(descricao);
		this.setNivelUrgencia(nivelUrgencia);
		this.setTempoAtendimento(1);
		this.setDataOcorrencia(dataOcorrencia);
		this.dataAgendamento = null;
		this.setCategoria(categoria);
		this.setTecnico(tecnico);
	}
	
	
	public NivelUrgencia getNivelUrgencia() {
		return nivelUrgencia;
	}


	public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}


	public GrupoOperador getGrupoOperador() {
		return grupoOperador;
	}


	public void setGrupoOperador(GrupoOperador grupoOperador) {
		this.grupoOperador = grupoOperador;
	}


	public Tecnico getTecnico() {
		return tecnico;
	}


	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public LocalDateTime getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDateTime dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public int getTempoAtendimento() {
		return TempoAtendimento;
	}
	public void setTempoAtendimento(int tempoAtendimento) {
		TempoAtendimento = tempoAtendimento;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
