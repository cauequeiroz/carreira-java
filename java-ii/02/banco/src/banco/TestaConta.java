package banco;

public class TestaConta {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01);
		atualizador.roda(cc);
		atualizador.roda(cp);
		
		System.out.println("===========================================");
		System.out.println("Saldo Total: " + atualizador.getSaldoTotal());
	}
}
