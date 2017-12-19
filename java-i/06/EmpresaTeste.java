class EmpresaTeste {
    public static void main(String[] args) {
        Empresa photon = new Empresa(10);

        Funcionario caue = new Funcionario();
        caue.setNome("Caue Queiroz");
        caue.setSalario(800);

        Funcionario hugo = new Funcionario();
        hugo.setNome("Hugo Cardoso");
        hugo.setSalario(950);

        Funcionario japa = new Funcionario();
        japa.setNome("Rick Taki");
        japa.setSalario(5000);

        photon.adicionar(caue);
        photon.adicionar(hugo);

        photon.mostraFuncionarios();
        photon.mostraTodasAsInformacoes();

        if (photon.contem(japa)) {
            System.out.println("Contem");
        } else {
            System.out.println("Não contem");
        }

        photon.getFuncionario(0).getInfo();
    }
}