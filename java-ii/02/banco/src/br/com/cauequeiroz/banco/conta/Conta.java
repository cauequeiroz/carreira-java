package br.com.cauequeiroz.banco.conta;

public abstract class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		if ( valor < 0 ) {
			throw new ValorInvalidoException(valor);
		}
		
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxa);
}
