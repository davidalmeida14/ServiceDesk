package model;

public class Item {
	
	private Long id;
	private String descricao;
	
	public Item(String descricao) {
		this.setDescricao(descricao);
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
	
	
}
