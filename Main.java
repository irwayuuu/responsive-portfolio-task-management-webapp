import java.util.ArrayList;
import java.util.List;

/**
 * Main execution class for the Portfolio & Task Management Application Simulator.
 * Author: Farrah Irwayu
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNIMAS Responsive Web App & Task Manager Simulator ===");
        
        List<TaskManager> tasks = new ArrayList<>();
        tasks.add(new TaskManager("TK-101", "Finalize Portfolio HTML Structure", "Completed", "High"));
        tasks.add(new TaskManager("TK-102", "Implement CSS Flexbox & Grid Styles", "Completed", "High"));
        tasks.add(new TaskManager("TK-103", "Test 10 Vanilla JavaScript Features", "In Progress", "Medium"));

        for (TaskManager task : tasks) {
            task.displayTaskStatus();
        }
    }
}