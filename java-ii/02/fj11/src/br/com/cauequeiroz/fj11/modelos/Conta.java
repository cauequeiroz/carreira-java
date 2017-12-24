package br.com.cauequeiroz.fj11.modelos;

public abstract class Conta implements Comparable<Conta> {
	protected double saldo;
	protected int numero;
	protected String nome;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNumero(int valor) {
		this.numero = valor;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public synchronized void deposita(double valor) {
		this.saldo += valor;
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
