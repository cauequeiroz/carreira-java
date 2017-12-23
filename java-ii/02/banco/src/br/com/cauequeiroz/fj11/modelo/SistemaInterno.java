package br.com.cauequeiroz.fj11.modelo;

public class SistemaInterno {
	public void autentica(Autenticavel usuario) {
		int senha = 123;
		
		if (usuario.autentica(senha) == true) {
			System.out.println("Senha correta. Bem vindo ao sistema!");
		} else {
			System.out.println("Senha incorreta.");
		}
	}
}
