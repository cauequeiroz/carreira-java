package banco;

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario caue = new Funcionario();
		caue.setSalario(1000.0);
		
		Gerente bruno = new Gerente();
		bruno.setSalario(1000.0);
		
		Desenvolvedor joao = new Desenvolvedor();
		joao.setSalario(1000.0);
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adicionar(caue);
		totalizador.adicionar(bruno);
		totalizador.adicionar(joao);

		System.out.println(caue.getBonus());
		System.out.println(bruno.getBonus());
		System.out.println(joao.getBonus());
		
		System.out.println("====================");
		System.out.println(totalizador.getTotal());		
	}
}