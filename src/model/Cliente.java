package model;

public class Cliente extends Pessoa {

	private String contrato;
	private String email;
	
	public Cliente(String nome, String cpf, String email, String contrato) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setContrato(contrato);
	}
	public void realizaChamado() {
		
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "{" + this.getNome() + " , " + this.getCpf() + " , " + this.email + " , " + this.contrato + "}";
	}
	

	
}
