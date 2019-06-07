package model;

public class Categoria {
	
	private Long id;
	
	private String nome;
	
	private SubCategoria subCategoria;

	
	public Categoria(String nome, SubCategoria subCategoria) {
		this.setSubCategoria(subCategoria);
		this.setSubCategoria(subCategoria);
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

	public SubCategoria getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(SubCategoria subCategoria) {
		this.subCategoria = subCategoria;
	}
	
		
	
}
