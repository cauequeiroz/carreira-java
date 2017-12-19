class Empresa {
    String nome;
    String cnpj;
    Funcionario[] funcionarios = new Funcionario[10];
    int vagaLivre = 0;

    void adicionar(Funcionario funcionario) {
        this.funcionarios[this.vagaLivre] = funcionario;
        this.vagaLivre++;
    }

    void mostraFuncionarios() {
        for(int i=0; i<this.vagaLivre; i++) {
            Funcionario funcionario = this.funcionarios[i];

            System.out.println("-----");
            System.out.println(funcionario.nome);            
        }
    }

    void mostraTodasAsInformacoes() {
        for(int i=0; i<this.vagaLivre; i++) {
            Funcionario funcionario = this.funcionarios[i];
            funcionario.mostra();
        }
    }

    boolean contem(Funcionario funcionario) {
        for(int i=0; i<this.vagaLivre; i++) {
            if (this.funcionarios[i] == funcionario) {
                return true;
            }
        }
        
        return false;
    }
}