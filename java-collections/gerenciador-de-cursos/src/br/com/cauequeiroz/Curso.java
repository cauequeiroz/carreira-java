package br.com.cauequeiroz;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + getTempoTotal() + " minutos, aulas: " + aulas + "]";
	}

	public void matricula(Aluno aluno) {
		alunos.add(aluno);
		matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int matricula) {
		if ( !matriculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException("Matricula não encontrada.");
		}
		
		return matriculaParaAluno.get(matricula);
	}
}
