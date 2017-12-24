package br.com.cauequeiroz.fj11.modelos;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	Map<String, Conta> contas = new HashMap<String, Conta>();
	
	public void adiciona(Conta c) {
		this.contas.put(c.getNome(), c);
	}
	
	public Conta pega(String nome) {
		return this.contas.get(nome);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
}
