package model;

import java.util.List;

/**
 * 
 * @author david
 *
 */
public class Atendente extends Pessoa implements GerenciaAtendente<Atendente> {
	
	private String matricula;
	
	
	public Atendente(String nome, String cpf, String matricula) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setMatricula(matricula);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public Atendente salvar(Atendente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Atendente> listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void atendeChamado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Atendente t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "{" + this.getNome() + " , " + this.getCpf() + " , " + this.getMatricula() + "}";
	}
}
