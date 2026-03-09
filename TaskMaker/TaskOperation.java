public abstract class TaskOperation implements TaskAction {

    protected TaskManager manager;
    protected InputHandler input = new InputHandler();

    public TaskOperation(TaskManager manager) {
        this.manager = manager;
    }

}