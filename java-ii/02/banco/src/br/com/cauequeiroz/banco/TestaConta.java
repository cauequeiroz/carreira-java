package br.com.cauequeiroz.banco;

import br.com.cauequeiroz.banco.conta.Conta;
import br.com.cauequeiroz.banco.conta.ContaCorrente;
import br.com.cauequeiroz.banco.conta.ContaPoupanca;
import br.com.cauequeiroz.banco.conta.ValorInvalidoException;
import br.com.cauequeiroz.banco.sistema.AtualizadorDeContas;

public class TestaConta {
	public static void main(String[] args) throws ValorInvalidoException {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		try {
			throw new RuntimeException("Teste");
		} catch(Exception error) {
			System.out.println(error.getMessage());
			System.out.println("deu ruim");
		} finally {
			System.out.println("acabou");
		}
		
		try {
			cc.deposita(-20);
		} catch (ValorInvalidoException error) {
			System.out.println(error.getMessage());
		}
		
		AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01);
		atualizador.roda(cc);
		atualizador.roda(cp);
		
		System.out.println("===========================================");
		System.out.println("Saldo Total: " + atualizador.getSaldoTotal());
	}
}
