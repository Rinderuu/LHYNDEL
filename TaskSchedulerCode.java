import java.util.*;

public class TaskSchedulerCode {

    // List to store tasks
    static List<String> tasks = new ArrayList<>();

    // Function to add a task to the list
    public static void add_task(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Function to run the scheduler
    public static void run_scheduler() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to schedule.");
        } else {
            System.out.println("Running tasks:");
            for (String task : tasks) {
                System.out.println("Running task: " + task);
            }
            tasks.clear();
            System.out.println("All tasks completed.");
        }
    }

    // Main function (entry point of the program)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying menu options
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Run Scheduler");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character left after nextInt()

            switch (choice) {
                case 1:
                    // Add task
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    add_task(task);
                    break;
                case 2:
                    // Run scheduler
                    run_scheduler();
                    break;
                case 3:
                    // Exit
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
