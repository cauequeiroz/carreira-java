package br.com.cauequeiroz.fj11.modelos;

public class ContaCorrente extends Conta {
	private int numero;
	
	public ContaCorrente(double valor) {
		super(valor);
	}
	
	public void setNumero(int valor) {
		this.numero = valor;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ContaCorrente)) return false;
		
		ContaCorrente conta = (ContaCorrente) obj;
		return this.numero == conta.getNumero();
	}
}
