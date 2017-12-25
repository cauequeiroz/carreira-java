package br.com.cauequeiroz.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
		
		List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        Iterator<String> iterador = letras.iterator();
        while(iterador.hasNext()) {
        	System.out.println(iterador.next());
        }
        
        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador2 = funcionarios.iterator();

        while (iterador2.hasNext()) {
            System.out.println(iterador2.next().getNome());
        } 
		
	}
}
