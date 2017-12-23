package br.com.cauequeiroz.fj11.modelo;

public class Desenvolvedor extends Funcionario {
	public double getBonus() {
		return this.salario * 0.5;
	}
}
