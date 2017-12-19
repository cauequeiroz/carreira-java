class Funcionario {
    private static int counter = 1;
    private int id;

    public static int getX() {
        return this.id;
    }

    public Funcionario() {
        this.id = counter;
        counter++;
    }

    public void getId() {
        System.out.println(this.id);
    }
}

class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario caue = new Funcionario();
        Funcionario hugo = new Funcionario();

        caue.getId();
        hugo.getId();
    }
}