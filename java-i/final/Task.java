class Task {
    private static int index = 1;
    private String nome;
    private int id;

    public Task(String nome) {
        this.nome = nome;
        this.id = this.index++;
    }

    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
}