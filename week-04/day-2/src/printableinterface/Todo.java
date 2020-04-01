package printableinterface;

public class Todo implements Printable {
    String task = "Buy milk";
    String priority = "high";
    boolean isDone = true;

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task + " |  Priority: " + priority + " | Done:" + isDone );
    }
}
