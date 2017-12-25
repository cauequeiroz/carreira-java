package br.com.cauequeiroz;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListasExercicios {
	public static void main(String[] args) {
		
		String curso1 = "Java I: Primeiros Passos";
		String curso2 = "//TODO remover esse item";
		String curso3 = "Java II: Orientação a Objetos";
		String curso4 = "Java III: Principais APIs e Bibliotecas";
		
		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		System.out.println("Removendo o segundo item da lista...");
		cursos.remove(1);
		
		System.out.println("\nO primeiro curso da lista é: " + cursos.get(0));
		
		System.out.println("\nListando os cursos:");
		System.out.println(cursos);
		
		Collections.sort(cursos);
		System.out.println("\nExibindo os cursos em ordem alfabetica:");
		System.out.println(cursos);
	}
}
