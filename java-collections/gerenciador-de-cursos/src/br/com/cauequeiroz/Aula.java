package br.com.cauequeiroz;

public class Aula implements Comparable<Aula> {
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getNome() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + titulo + ", " + tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return titulo.compareTo(outraAula.titulo);
	}	
}
