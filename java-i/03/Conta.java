class Conta {
    int numero;
    int agencia;
    double saldo;
    Pessoa titular;

    void deposita(double valor) {
        this.saldo += valor;
    }
    
    void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    void transfere(double valor, Conta conta) {
        this.saldo -= valor;
        conta.saldo += valor;
    }
}

class Pessoa {
    String nome;
    String cpf;
    String dataDeNascimento;
}

class Programa {
    public static void main(String[] args) {
        Conta caue = new Conta();
        caue.numero = 123;
        caue.agencia = 321;
        caue.saldo = 100;
        
        caue.titular = new Pessoa();
        caue.titular.nome = "Caue Queiroz";
        caue.titular.cpf = "191000000";
        caue.titular.dataDeNascimento = "07/06/1995";

        Conta igor = new Conta();
        igor.numero = 456;
        igor.agencia = 654;
        igor.saldo = 100;
        
        igor.titular = new Pessoa();
        igor.titular.nome = "Igor Cardoso";
        igor.titular.cpf = "43287654637";
        igor.titular.dataDeNascimento = "10/10/1975";

        caue.transfere(50, igor);
        igor.transfere(50, caue);

        System.out.println("Conta: " + caue.titular.nome + " - Saldo: " + caue.saldo);
        System.out.println("Conta: " + igor.titular.nome + " - Saldo: " + igor.saldo);
    }
}