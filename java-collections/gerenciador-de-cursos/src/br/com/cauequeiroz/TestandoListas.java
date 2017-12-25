package br.com.cauequeiroz;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		String aula1 = "Trabalhando com Sets";
		String aula2 = "Conhecendo o ArrayList";
		String aula3 = "Entendendo o Map";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println("Exibindo o array:");
		System.out.println(aulas);		
		System.out.println();
		
		System.out.println("Exibindo o tamanho do array: " + aulas.size());		
		System.out.println();
		
		System.out.println("Listando o array com foreach:");
		for (String aula : aulas) {
			System.out.println("> " + aula);
		}		
		System.out.println();
		
		System.out.println("Listando o array com .get()");
		for (int i=0; i<aulas.size(); i++) {
			System.out.println("> " + aulas.get(i));
		}
		System.out.println();
		
		System.out.println("Listando o array com foreach(lambda):");		
		aulas.forEach(aula -> System.out.println("> " + aula));
		System.out.println();
		
		System.out.println("Ordenando o array:");
		System.out.println("Antes: " + aulas);
		Collections.sort(aulas);
		System.out.println("Depois: " + aulas);
		
	}
}
