class Empresa {
    String nome;
    String cnpj;
    Funcionario[] funcionarios;
    int vagaLivre = 0;

    public Empresa(int tamanho) {
        this.funcionarios = new Funcionario[tamanho];
    }

    void adicionar(Funcionario funcionario) {
        this.funcionarios[this.vagaLivre] = funcionario;
        this.vagaLivre++;
    }

    void mostraFuncionarios() {
        for(int i=0; i<this.vagaLivre; i++) {
            Funcionario funcionario = this.funcionarios[i];

            System.out.println("-----");
            System.out.println(funcionario.getNome());            
        }
    }

    public Funcionario getFuncionario(int posicao) {
        return this.funcionarios[posicao];
    }

    void mostraTodasAsInformacoes() {
        for(int i=0; i<this.vagaLivre; i++) {
            Funcionario funcionario = this.funcionarios[i];
            funcionario.getInfo();
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