package br.com.cauequeiroz.fj11.programa;

import br.com.cauequeiroz.banco.conta.ContaCorrente;
import br.com.cauequeiroz.banco.conta.ValorInvalidoException;

public class TestaTributavel {
	public static void main(String[] args) throws ValorInvalidoException {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		
		System.out.println(cc.calculaTributos());
	}
}
