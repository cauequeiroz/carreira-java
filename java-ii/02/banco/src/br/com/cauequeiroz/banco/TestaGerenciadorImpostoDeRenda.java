package br.com.cauequeiroz.banco;

import br.com.cauequeiroz.banco.conta.ContaCorrente;
import br.com.cauequeiroz.banco.conta.ValorInvalidoException;
import br.com.cauequeiroz.banco.sistema.GerenciadorImpostoDeRenda;
import br.com.cauequeiroz.fj11.modelo.SeguroDeVida;

public class TestaGerenciadorImpostoDeRenda {
	public static void main(String[] args) throws ValorInvalidoException {
		GerenciadorImpostoDeRenda imposto = new GerenciadorImpostoDeRenda();
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100);
		
		imposto.adiciona(conta);
		imposto.adiciona(seguro);
		System.out.printf("O saldo é %.2f", conta.getSaldo());
	}
}
