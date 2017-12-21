package banco;

public class Gerente extends Funcionario implements Autenticavel {
	public double getBonus() {
		return this.salario * 0.3;
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}
}
