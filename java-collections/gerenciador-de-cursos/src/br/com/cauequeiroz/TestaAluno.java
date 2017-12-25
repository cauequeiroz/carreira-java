package br.com.cauequeiroz;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Caue Queiroz");
		alunos.add("Itallo Vieira");
		alunos.add("Gustavo Cerbasi");
		
		for(String aluno: alunos) {
			System.out.println("> " + aluno);
		}
		
		System.out.println("\nNúmero de alunos: " + alunos.size());
		
		alunos.add("Caue Queiroz");		
		
		System.out.println("\nNúmero de alunos: " + alunos.size());
		
		
		
	}
}
