public class ViewTasks extends TaskOperation {
 
    public ViewTasks(TaskManager manager) {
        super(manager);
    }
 
    public void execute() {
        manager.showTasks();
    }
 
}