class Turma {
    Aluno[] alunos;

    void imprimeNotas() {
        for(int i=0; i<this.alunos.length; i++) {
            Aluno aluno = this.alunos[i];
            if(aluno == null) continue;
            System.out.println(aluno.nome + ": " + aluno.nota);
        }
    }
}

class Aluno {
    String nome;
    int nota;
}

class TurmaTeste {
    public static void main(String[] args) {
        Turma html = new Turma();
        html.alunos = new Aluno[10];

        html.alunos[0] = new Aluno();
        html.alunos[0].nome = "Caue Queiroz";
        html.alunos[0].nota = 10;

        html.alunos[1] = new Aluno();
        html.alunos[1].nome = "Igor Silva";
        html.alunos[1].nota = 8;

        html.imprimeNotas();
    }
}