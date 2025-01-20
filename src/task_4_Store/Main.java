package task_4_Store;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StoreNotificationBuilder builder1 = new StoreNotificationBuilder();
        builder1.setSeverity(AlertSeverity.PROMOTION);
        builder1.setMessage("Big sale on laptops!");
        builder1.setCode(101);
        builder1.setDate(LocalDate.now());
        builder1.setProduct("Laptops");
        StoreNotification notif1 = builder1.build();

        StoreNotificationBuilder builder2 = new StoreNotificationBuilder();
        builder2.setSeverity(AlertSeverity.INFO);
        builder2.setMessage("New phone models available.");
        builder2.setCode(202);
        builder2.setDate(LocalDate.now());
        builder2.setProduct("Smartphones");
        StoreNotification notif2 = builder2.build();

        StoreController store = new StoreController();
        EmailNotifier emailNotifier = new EmailNotifier("customer@example.com");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+123456789");
        TelegramNotifier telegramNotifier = new TelegramNotifier("tech_user", true);
        StoreLogNotifier logNotifier = new StoreLogNotifier("store_log");

        store.subscribe(emailNotifier);
        store.subscribe(phoneNotifier);
        store.subscribe(telegramNotifier);
        store.subscribe(logNotifier);

        store.addNotification(notif1);
        store.addNotification(notif2);
        store.dispatchNotifications();

        store.unsubscribe(phoneNotifier);
        store.dispatchNotifications();
    }
}
