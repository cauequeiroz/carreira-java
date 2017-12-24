package br.com.cauequeiroz.fj11.modelos;

public class ContaCorrente extends Conta {	
	public ContaCorrente(double valor) {
		super(valor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ContaCorrente)) return false;
		
		ContaCorrente conta = (ContaCorrente) obj;
		return this.numero == conta.getNumero();
	}

	@Override
	public int compareTo(Conta outra) {
		return this.nome.compareTo(outra.nome);
	}
}
