package br.com.cauequeiroz.fj11.modelo;

public class TotalizadorDeBonus {
	private double total = 0;
	
	public void adicionar(Funcionario f) {
		this.total += f.getBonus();
	}
	
	public double getTotal() {
		return this.total;
	}
}
