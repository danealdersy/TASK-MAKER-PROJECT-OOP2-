import java.util.ArrayList;
 
public class TaskManager {
 
    private ArrayList<Task> tasks = new ArrayList<>();
    private int counter = 1;
 
    public void addTask(String desc) {
        tasks.add(new Task(counter++, desc));
    }
 
    public void removeTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getId() == id) {
                tasks.remove(t);
                System.out.println("Task removed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
 
    public void completeTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getId() == id) {
                t.markCompleted();
                System.out.println("Task completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
 
    public void showTasks() {
 
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
 
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            t.display();
        }
    }
}