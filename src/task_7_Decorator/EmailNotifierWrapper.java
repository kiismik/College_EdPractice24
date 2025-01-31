package task_7_Decorator;

public class EmailNotifierWrapper extends AbstractWrapper {
    private final String uniqueName;

    public EmailNotifierWrapper(INotificationWrapper wrappee, String uniqueName) {
        super(wrappee);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending email notification: " + alert.getMessage());
        super.notify(alert);
    }
}
