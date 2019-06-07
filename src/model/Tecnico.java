package model;

import java.util.List;

/**
 * 
 * @author lab10usuario38
 *
 */
public class Tecnico extends Pessoa implements GerenciaTecnico<Tecnico> {

	private String matricula;
	
	
	public Tecnico(String nome, String cpf, String matricula ) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	@Override
	public
	void fazAniversario() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Tecnico salvar(Tecnico t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Tecnico> listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void atendeOS() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remover(Tecnico t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "{" +this.getNome() + " , " + this.getCpf() + " , " + this.getMatricula() + " , " + this.getTelefone()+ "}";
	}

}
