package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogAtendimento {

	private Long id;
	
	private LocalDateTime dataLog;
	
	private Pessoa operador;
	
	private String historicoAtendimento;
	
	public LogAtendimento(LocalDateTime dataLog, Pessoa operador, String historicoAtendimento) {
		this.setDataLog(dataLog);
		this.setOperador(operador);
		this.setHistoricoAtendimento(historicoAtendimento);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataLog() {
		return dataLog;
	}

	public void setDataLog(LocalDateTime dataLog) {
		this.dataLog = dataLog;
	}

	public Pessoa getOperador() {
		return operador;
	}

	public void setOperador(Pessoa operador) {
		this.operador = operador;
	}

	public String getHistoricoAtendimento() {
		return historicoAtendimento;
	}

	public void setHistoricoAtendimento(String historicoAtendimento) {
		this.historicoAtendimento = historicoAtendimento;
	}
	
	
	
	@Override
	public String toString() {
		return " Data: " + this.getDataLog().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))+ ", Operador: " + this.operador.getNome() + ", Historico: " + this.getHistoricoAtendimento();
	}
}
