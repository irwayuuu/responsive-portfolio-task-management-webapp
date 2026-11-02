/**
 * Represents an individual task item managed by the application logic.
 */
public class TaskManager {
    private String taskId;
    private String taskTitle;
    private String status;
    private String priority;

    // Constructor
    public TaskManager(String taskId, String taskTitle, String status, String priority) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.status = status;
        this.priority = priority;
    }

    // Display Method
    public void displayTaskStatus() {
        System.out.println("--------------------------------------------------");
        System.out.println("Task ID: " + taskId);
        System.out.println("Title: " + taskTitle);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
    }
}