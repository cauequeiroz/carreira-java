package br.com.cauequeiroz.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class TestaPerformance {
	public static void main(String[] args) {
		Collection<Integer> numeros = new HashSet<>();
		int total = 50000;
		
		
		for (int i=0; i<total; i++) {
			numeros.add(i);
		}
		long inicio = System.currentTimeMillis();
		
		for (int i=0; i<total; i++) {
			numeros.contains(i);
		}
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);		
	}
}
