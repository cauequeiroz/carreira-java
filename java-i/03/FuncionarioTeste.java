class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario caue = new Funcionario();
        caue.nome = "Caue Queiroz";
        caue.salario = 800;
        caue.dataDeEntrada.preencheData(7, 6, 1995);

        caue.mostra();
    }
}