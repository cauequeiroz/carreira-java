package br.com.cauequeiroz.fj11.programa;

public class TestaString {
	public static void main(String[] args) {
		
		String nome = "Socorram-me, subi no ônibus em Marrocos";		
		revertPhrase(nome);
		revertRightPhrase(nome);
		
	}
	
	public static void revertPhrase(String nome) {
		for(int i=nome.length() - 1; i>=0; i--) {
			System.out.print(nome.charAt(i));
		}
		
		System.out.println("");
	}
	
	public static void revertRightPhrase(String nome) {
		String[] frase = nome.split(" ");
		
		for(int i=frase.length - 1; i>=0; i--) {
			System.out.print(frase[i] + " ");
		}
		
		System.out.println("");
	}
	
	
}
