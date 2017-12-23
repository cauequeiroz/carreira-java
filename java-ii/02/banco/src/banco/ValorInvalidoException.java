package banco;

public class ValorInvalidoException extends Exception {
	public ValorInvalidoException(double valor) {
		super("Você tentou depositar um valor inválido. (" + valor + ")");
	}
}
