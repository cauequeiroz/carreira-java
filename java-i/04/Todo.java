class Task {
    String nome;
}

class Todo {
    Task[] tasks;
    int emptyTaskIndex = 0;

    void listAllTasks() {
        for(int i=0; i<this.emptyTaskIndex; i++) {
            Task task = this.tasks[i];
            System.out.println("Task: " + task.nome);
        }
    }

    void addTask(Task task) {
        this.tasks[this.emptyTaskIndex] = task;
        this.emptyTaskIndex++;
    }
}

class TodoTeste {
    public static void main(String[] args) {
        Todo lista = new Todo();
        lista.tasks = new Task[5];

        Task t1 = new Task();
        t1.nome = "Comprar celular.";

        Task t2 = new Task();
        t2.nome = "Ir na igreja.";

        lista.addTask(t1);
        lista.addTask(t2);
        lista.listAllTasks();
    }
}