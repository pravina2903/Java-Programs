import java.util.Scanner;

public class Newsfeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a topic: ");
        System.out.println("1. Robot");
        System.out.println("2. Human");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Displaying Robot newsfeed: AI breakthroughs, Automation trends.");
            case 2 -> System.out.println("Displaying Human newsfeed: Wellness tips, Personal growth articles.");
            default -> System.out.println("Invalid choice.");
        }
    }
}

