class EmpresaTeste {
    public static void main(String[] args) {
        Empresa photon = new Empresa();

        Funcionario caue = new Funcionario();
        caue.nome = "Caue Queiroz";
        caue.salario = 800;

        Funcionario hugo = new Funcionario();
        hugo.nome = "Hugo Cardoso";
        hugo.salario = 950;

        Funcionario japa = new Funcionario();
        japa.nome = "Rick Taki";
        japa.salario = 5000;

        photon.adicionar(caue);
        photon.adicionar(hugo);

        photon.mostraFuncionarios();
        photon.mostraTodasAsInformacoes();

        if (photon.contem(japa)) {
            System.out.println("Contem");
        } else {
            System.out.println("Não contem");
        }
    }
}