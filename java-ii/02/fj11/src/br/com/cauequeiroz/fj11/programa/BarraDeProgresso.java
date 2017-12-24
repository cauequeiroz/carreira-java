package br.com.cauequeiroz.fj11.programa;

public class BarraDeProgresso implements Runnable {
	
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("Barra de Progresso: " + i);
		}
	}
}
