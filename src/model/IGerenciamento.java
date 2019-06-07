package model;

import java.util.List;

public interface IGerenciamento<T>{
	
	public T salvar(T t);
	public List<T> listar();
	public void remover(T t);
	
}
