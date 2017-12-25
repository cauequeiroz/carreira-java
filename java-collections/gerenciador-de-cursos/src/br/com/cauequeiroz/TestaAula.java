package br.com.cauequeiroz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaAula {
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Conhecendo o ArrayList", 21);
		Aula aula2 = new Aula("Entendendo HashSet", 16);
		Aula aula3 = new Aula("Entendendo HashMap", 18);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
