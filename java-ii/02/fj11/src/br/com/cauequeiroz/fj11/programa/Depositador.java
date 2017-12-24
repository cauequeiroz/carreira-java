package br.com.cauequeiroz.fj11.programa;

import br.com.cauequeiroz.fj11.modelos.Conta;

public class Depositador implements Runnable {
	private Conta conta;
	
	public Depositador(Conta c) {
		this.conta = c;
	}
	
	public void run() {
		this.conta.deposita(100.0);
	}
	
}
