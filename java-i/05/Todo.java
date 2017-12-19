class Task {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}

class Todo {
    private Task[] tasks = new Task[10];
    private int emptyTask = 0;

    public void addTask(Task task) {
        this.tasks[this.emptyTask] = task;
        this.emptyTask++;
    }

    public void listTasks() {
        for(int i=0; i<this.emptyTask; i++) {
            System.out.println(this.tasks[i].getNome());
        }
    }
}

class TodoTeste {
    public static void main(String[] args) {
        Todo program = new Todo();

        Task t1 = new Task();
        t1.setNome("Comprar pao");

        Task t2 = new Task();
        t2.setNome("Jogar lol");


        program.addTask(t1);
        program.addTask(t2);
        program.listTasks();
    }
}