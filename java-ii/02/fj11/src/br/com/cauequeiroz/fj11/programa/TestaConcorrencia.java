package br.com.cauequeiroz.fj11.programa;

import br.com.cauequeiroz.fj11.modelos.Conta;
import br.com.cauequeiroz.fj11.modelos.ContaCorrente;

public class TestaConcorrencia {
	public static void main(String[] args) throws InterruptedException {
		
		Conta c1 = new ContaCorrente(500.0);
		
		Depositador depositador = new Depositador(c1);
		
		Thread t1 = new Thread(depositador);
		Thread t2 = new Thread(depositador);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c1.getSaldo());
	}
}
