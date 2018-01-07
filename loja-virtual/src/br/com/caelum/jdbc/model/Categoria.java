package br.com.caelum.jdbc.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<>();
	
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionaProduto(Produto p) {
		produtos.add(p);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	@Override
	public String toString() {
		return "["+id+"] " + nome;
	}
}
