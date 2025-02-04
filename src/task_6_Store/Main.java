package task_6_Store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your platform (online, retail, app): ");
        String platform = scanner.nextLine();

        ApplicationManager appManager = new ApplicationManager(platform);
        appManager.run();
    }
}
