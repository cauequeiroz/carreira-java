package banco;

public class GerenciadorImpostoDeRenda {
	private double total = 0;
	
	public void adiciona(Tributavel servico) {		
		System.out.println("Adicionando tributavel: " + servico);
		this.total += servico.calculaTributos();
	}
	
	public double getTotal() {
		return this.total;
	}	
}
