import java.util.ArrayList;
import java.util.Scanner;

public class TaskMaker {

    private TaskManager manager = new TaskManager();
    private Menu menu = new Menu();                  

    public void start() {
        int choice = 0;

        while (choice != 5) {
            menu.display();            
            choice = menu.getChoice(); 

            if (choice == 1) {
                AddTask add = new AddTask(manager);
                add.execute();
            } else if (choice == 2) {
                ViewTasks view = new ViewTasks(manager);
                view.execute();
            } else if (choice == 3) {
                CompleteTask comp = new CompleteTask(manager);
                comp.execute();
            } else if (choice == 4) {
                RemTask remove = new RemoveTask(manager);
                rem.execute();
            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        TaskMaker app = new TaskMaker();
        app.start();
    }
}
