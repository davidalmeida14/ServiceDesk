package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.enums.Ocorrencia;
import model.enums.StatusOcorrencia;
import model.enums.TipoResolucao;

public class Atendimento {

	private Long id;
	private Long protocolo;
	private LocalDateTime dataAtendimento;
	private LocalDateTime dataAlvo;
	private Cliente cliente;
	private Atendente atendente;
	private Tecnico tecnico;
	private Ocorrencia ocorrencia;
	private TipoResolucao tipoResolucao;
	private StatusOcorrencia statusOcorrencia;
	private List<LogAtendimento> logAtendimento = new ArrayList<LogAtendimento>();
	private PesquisaSatisfacao pesquisaSatisfacao;
	private Boolean atendimentoFinalizado;
	private List<Equipamento> equipamentos = new ArrayList<Equipamento>();
	
	
	public Atendimento (Cliente cliente, Atendente atendente) {
		this.cliente = cliente;
		this.atendente = atendente;
		this.setDataAtendimento(LocalDateTime.now());
	}
	public void atualizarStatus(StatusOcorrencia statusOcorrencia, LogAtendimento log) {
		this.statusOcorrencia = statusOcorrencia;
		this.logAtendimento.add(log);
	}
	
	public void finalizarAtendimento(PesquisaSatisfacao pesquisaSatisfacao) {
		this.pesquisaSatisfacao = pesquisaSatisfacao;
		this.atendimentoFinalizado = true;			
	}
	
	public void adicionarInteracao (LogAtendimento interacao) {
		this.logAtendimento.add(interacao);
	}
	
	public void novaOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public void alterarDataAlvo(LocalDateTime dateTime) {
		this.setDataAlvo(dateTime);
	}
	
	public void utilizarEquipamento(List<Equipamento> equipamentos) {
		this.setEquipamentos(equipamentos);
	}
	
	public void visualizarLog() {
		this.logAtendimento.forEach(l ->{
			System.out.println(l.toString());
		});
	}
	
	// Getters and Setters
	
	public PesquisaSatisfacao getPesquisaSatisfacao() {
		return pesquisaSatisfacao;
	}

	public void setPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao) {
		this.pesquisaSatisfacao = pesquisaSatisfacao;
	}

	public Boolean getAtendimentoFinalizado() {
		return atendimentoFinalizado;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public void setAtendimentoFinalizado(Boolean atendimentoFinalizado) {
		this.atendimentoFinalizado = atendimentoFinalizado;
	}

	public StatusOcorrencia getStatusOcorrencia() {
		return statusOcorrencia;
	}
	

	public LocalDateTime getDataAlvo() {
		return dataAlvo;
	}
	public void setDataAlvo(LocalDateTime dataAlvo) {
		this.dataAlvo = dataAlvo;
	}
	public void setStatusOcorrencia(StatusOcorrencia statusOcorrencia) {
		this.statusOcorrencia = statusOcorrencia;
	}


	public List<LogAtendimento> getLogAtendimento() {
		return logAtendimento;
	}
	public void setLogAtendimento(List<LogAtendimento> logAtendimento) {
		this.logAtendimento = logAtendimento;
	}
	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Long protocolo) {
		this.protocolo = protocolo;
	}
	public LocalDateTime getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(LocalDateTime dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public TipoResolucao getTipoResolucao() {
		return tipoResolucao;
	}
	public void setTipoResolucao(TipoResolucao tipoResolucao) {
		this.tipoResolucao = tipoResolucao;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	
	
}
