package br.com.cauequeiroz.fj11.modelo;

public class Funcionario {
	protected double salario;
	
	public void setSalario(double valor) {
		this.salario = valor;
	}
	
	public double getBonus() {
		return this.salario * 0.2;
	}
}