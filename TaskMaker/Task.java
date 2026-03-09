public class Task {

    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        completed = false;
    }

    public int getId() {
        return id;
    }

    public void markCompleted() {
        completed = true;
    }

    public void display() {

        String status = completed ? "[Done]" : "[Pending]";
        System.out.println(id + ". " + description + " " + status);

    }

}
