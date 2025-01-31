package task_7_Decorator;

public class TelegramNotifierWrapper extends AbstractWrapper {
    private final String userId;

    public TelegramNotifierWrapper(INotificationWrapper wrappee, String userId) {
        super(wrappee);
        this.userId = userId;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending Telegram message to user " + userId + ": " + alert.getMessage());
        super.notify(alert);
    }
}
