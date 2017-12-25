package br.com.cauequeiroz;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso html5 = new Curso("HTML5: Programando a Web", "Caue Queiroz");
		html5.adiciona(new Aula("Introdução ao HTML5", 21));
		html5.adiciona(new Aula("Tags Semanticas", 12));
		html5.adiciona(new Aula("Construindo Formuários", 14));
			
		System.out.println("Aulas: " + html5.getAulas());
		System.out.println("Tempo total de curso: " + html5.getTempoTotal());
		System.out.println(html5);
		
		Aluno a1 = new Aluno("Caue Queiroz", 14015);
		Aluno a2 = new Aluno("Mariana Nolasco", 14032);
		Aluno a3 = new Aluno("Sophia Oliveira", 13001);
		
		html5.matricula(a1);
		html5.matricula(a2);
		html5.matricula(a3);
		
		System.out.println("\nAlunos matriculados:");
		html5.getAlunos().forEach(Aluno -> System.out.println(Aluno));
		
		System.out.println("\nO aluno " + a1 + " está matriculado?");
		System.out.println(html5.estaMatriculado(a1));
		
		Aluno caue = new Aluno("Caue Queiroz", 14015);
		System.out.println(html5.estaMatriculado(caue));
		
		System.out.println("\nQuem é o aluno 14032?");
		System.out.println(html5.buscaMatricula(14032));
	}
}
