package task_7_Decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        INotificationWrapper wrappee = new EmailNotifierWrapper(null, "admin@company.com");

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter platform (windows, linux): ");
        String platform = scanner.nextLine();

        System.out.println("Enter telegram user (enter null if null: ");
        String telegramUser = scanner.nextLine();
        if (telegramUser.equals("null")){
            telegramUser = null;
        }
        System.out.println("Enter phone number (enter null if null: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.equals("null")){
            phoneNumber = null;
        }

        if (platform.equalsIgnoreCase("linux")) {
            wrappee = new SysLogNotifierWrapper(wrappee, "LinuxSysLog");
        } else if (platform.equalsIgnoreCase("windows")) {
            wrappee = new SysLogNotifierWrapper(wrappee, "WindowsSysLog");
        }

        if (telegramUser != null) {
            wrappee = new TelegramNotifierWrapper(wrappee, telegramUser);
        }

        if (phoneNumber != null) {
            wrappee = new PhoneNotifierWrapper(wrappee, phoneNumber);
        }

        SystemController sysControl = new SystemController(wrappee);

        SystemAlert alert = new SystemAlert(
                AlertSeverity.WARNING,
                "Test message",
                123,
                "processName"
        );

        sysControl.informAlert(alert);
    }
}
