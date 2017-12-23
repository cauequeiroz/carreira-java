package br.com.cauequeiroz.banco.sistema;

import br.com.cauequeiroz.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
	public void roda(Conta c) {
		System.out.println("===========================================");
		System.out.println("Saldo anterior: R$"+c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo atual: R$"+c.getSaldo());
		
		this.saldoTotal += c.getSaldo();
	}
}
