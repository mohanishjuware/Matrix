import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Task\n2. Show Tasks\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task: ");
                    tasks.add(sc.nextLine());
                }
                case 2 -> tasks.forEach(System.out::println);
                case 3 -> System.exit(0);
            }
        }
    }
}
