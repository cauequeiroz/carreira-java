class Programa {
    public static void main(String[] args) {

        Task t1 = new Task("Buy something");
        Task t2 = new Task("Do something...");
        Task t3 = new Task("Do another thing...");

        TodoList todolist = new TodoList(10);
        todolist.addTask(t1);
        todolist.addTask(t2);
        todolist.addTask(t3);

        todolist.listTasks();
    }
}