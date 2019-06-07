package model;

import java.util.ArrayList;
import java.util.List;

public class SubCategoria implements IGerenciamento<SubCategoria>{

	private Long id;
	private String descricao;
	private List<Item> itens;
	
	
	public SubCategoria (String nome, Item item) {
		itens = new ArrayList<Item>();
		this.setDescricao(nome);
		this.itens.add(item);
		
	}
	
	@Override
	public SubCategoria salvar(SubCategoria t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<SubCategoria> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void remover(SubCategoria t) {
		// TODO Auto-generated method stub
		
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

	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
}
