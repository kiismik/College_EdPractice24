package task_7_Decorator;

public class PhoneNotifierWrapper extends AbstractWrapper {
    private final String phoneNumber;

    public PhoneNotifierWrapper(INotificationWrapper wrappee, String phoneNumber) {
        super(wrappee);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending phone notification to " + phoneNumber + ": " + alert.getMessage());
        super.notify(alert);
    }
}
