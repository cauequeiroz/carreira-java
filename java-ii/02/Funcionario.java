class Funcionario {
    private String nome;
    protected double salario;

    public void setSalario(double valor) {
        this.salario = valor;
    }
    public double getBonus() {
        return this.salario * 0.2;
    }
}

class Gerente extends Funcionario {
    public double getBonus() {
        return this.salario * 0.5;
    }
}

class TotalizadorBonus {
    private double total = 0;

    public void adiciona(Funcionario f) {
        this.total += f.getBonus();
    }
    public double getTotal() {
        return this.total;
    }
}

class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario caue = new Funcionario();
        caue.setSalario(2500);

        Gerente bruno = new Gerente();
        bruno.setSalario(2500);

        System.out.println(caue.getBonus());
        System.out.println(bruno.getBonus());

        TotalizadorBonus total = new TotalizadorBonus();
        total.adiciona(caue);
        total.adiciona(bruno);

        System.out.println(total.getTotal());
    }
}