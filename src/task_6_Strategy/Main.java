package task_6_Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your platform for example (windows, linux, mac, android): ");
        String platform = scanner.nextLine();

        ApplicationManager appManager = new ApplicationManager(platform);
        appManager.run();
    }
}
