package br.com.cauequeiroz.fj11.programa;

import br.com.cauequeiroz.fj11.modelo.Desenvolvedor;
import br.com.cauequeiroz.fj11.modelo.Funcionario;
import br.com.cauequeiroz.fj11.modelo.Gerente;
import br.com.cauequeiroz.fj11.modelo.TotalizadorDeBonus;

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario caue = new Funcionario();
		caue.setSalario(1000.0);
		
		Gerente bruno = new Gerente();
		bruno.setSalario(1000.0);
		
		Desenvolvedor joao = new Desenvolvedor();
		joao.setSalario(1000.0);
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adicionar(caue);
		totalizador.adicionar(bruno);
		totalizador.adicionar(joao);

		System.out.println(caue.getBonus());
		System.out.println(bruno.getBonus());
		System.out.println(joao.getBonus());
		
		System.out.println("====================");
		System.out.println(totalizador.getTotal());		
	}
}