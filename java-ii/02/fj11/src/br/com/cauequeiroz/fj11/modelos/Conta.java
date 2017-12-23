package br.com.cauequeiroz.fj11.modelos;

public abstract class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta é " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Conta) ) return false;
		
		Conta outra = (Conta) obj;		
		return this.saldo == outra.saldo;
	}
}
