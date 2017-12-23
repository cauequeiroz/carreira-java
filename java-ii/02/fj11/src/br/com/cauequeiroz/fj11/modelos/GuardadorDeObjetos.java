package br.com.cauequeiroz.fj11.modelos;

public class GuardadorDeObjetos {
	private Object[] contas;
	private int posicaoLivre;
	
	public GuardadorDeObjetos() {
		this.contas = new Object[100];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object conta) {
		this.contas[posicaoLivre] = conta;
		this.posicaoLivre++;
	}
	
	public Object pega(int posicao) {
		return this.contas[posicao];
	}
}
