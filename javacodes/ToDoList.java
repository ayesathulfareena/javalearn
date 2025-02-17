import java.util.*;

class Task {
    public String description;
    public boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean markCompleted() {
        isCompleted = true;
        return isCompleted;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description;
    }
}

class TaskList {
    public ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Your tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("Task marked as completed: " + tasks.get(index).getDescription());
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task removed: " + tasks.get(index).getDescription());
            tasks.remove(index);
        } else {
            System.out.println("No task found at this number.");
        }
    }
}

public class ToDoList{
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice;
            System.out.println("\nTo-Do List:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");
            System.out.print("Enter an option number: ");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a description for the task: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                    taskList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter the task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    taskList.removeTask(removeIndex);
                    break;
                case 4:
                    System.out.print("Enter the task number to mark as completed: ");
                    int markIndex = scanner.nextInt() - 1;
                    taskList.markTask(markIndex);
                    break;
                case 5:
                    System.out.println("Thank you for using the To-Do List.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }
}
