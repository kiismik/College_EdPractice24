package task_7_Decorator;

public class SysLogNotifierWrapper extends AbstractWrapper {
    private final String journalName;

    public SysLogNotifierWrapper(INotificationWrapper wrappee, String journalName) {
        super(wrappee);
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Logging to system journal " + journalName + ": " + alert.getMessage());
        super.notify(alert);
    }
}
