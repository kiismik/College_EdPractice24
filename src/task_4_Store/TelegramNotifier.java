package task_4_Store;

public class TelegramNotifier implements Observer {
    private String username;
    private boolean isInstant;

    public TelegramNotifier(String username, boolean isInstant) {
        this.username = username;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(StoreNotification notification) {
        System.out.println(notification.toString() + " sent to Telegram user " + this.username + ". Instant delivery? " + this.isInstant);
    }
}
