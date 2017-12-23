package br.com.cauequeiroz.fj11.programa;

import java.io.PrintStream;

import br.com.cauequeiroz.fj11.modelos.ContaCorrente;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x = new Integer(2);
		Integer y = new Integer(2);
		
		if ( x.equals(y) ) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
		}
		
		System.out.println(x.toString());
		
		PrintStream saida = System.out;
		saida.println("Caue");
		
		ContaCorrente cc = new ContaCorrente(500);
		ContaCorrente cc2 = new ContaCorrente(700);
		cc.setNumero(123);
		cc2.setNumero(123);
		saida.println(cc.equals(cc2));
		
	}
}
