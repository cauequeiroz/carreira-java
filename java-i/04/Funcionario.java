class Funcionario {
    String nome;
    String departamento;
    Data dataDeEntrada = new Data();
    String RG;
    double salario;

    void recebeAumento(double valor) {
        this.salario += valor;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Entrada: " + this.dataDeEntrada.getFormatada());
        System.out.println("RG: " + this.RG);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Ganho Anual: R$" + this.calculaGanhoAnual());
    }
}