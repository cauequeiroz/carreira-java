package br.com.cauequeiroz.fj11.programa;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int i=0; i<1000; i++) {
			numeros.add(i);
		}
		
		Collections.reverse(numeros);
		
		for(Integer i: numeros) {
			System.out.println(i);
		}
		
		
		
		
	}
}
