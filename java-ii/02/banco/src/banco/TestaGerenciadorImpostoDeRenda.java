package banco;

public class TestaGerenciadorImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorImpostoDeRenda imposto = new GerenciadorImpostoDeRenda();
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100);
		
		imposto.adiciona(conta);
		imposto.adiciona(seguro);
		System.out.printf("O saldo é %.2f", conta.getSaldo());
	}
}
