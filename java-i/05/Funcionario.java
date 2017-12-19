class Funcionario {
    private double salario;
    private String nome;
    private String departamento;
    private Data dataDeEntrada = new Data();
    private String RG;

    public void recebeAumento(double valor) {
        this.salario += valor;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }

    public void getInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Entrada: " + this.dataDeEntrada.getFormatada());
        System.out.println("RG: " + this.RG);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Ganho Anual: R$" + this.getGanhoAnual());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double valor) {
        this.salario = valor;
    }
}