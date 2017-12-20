class TodoList {
    private Task[] tasks;
    private int emptySlotIndex = 0;

    public TodoList(int size) {
        this.tasks = new Task[size];
    }

    public void addTask(Task task) {
        this.tasks[this.emptySlotIndex] = task;
        this.emptySlotIndex++;
    }
    public void listTasks() {
        for(Task task: this.tasks) {
            if (task == null) continue;
            System.out.println("["+task.getId()+"] " + task.getNome());
        }
    }
}