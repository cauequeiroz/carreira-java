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
	}
}
