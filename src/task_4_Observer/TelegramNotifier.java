package task_4_Observer;

public class TelegramNotifier implements Observer{
    private String userId;
    private boolean isInstant;
    public TelegramNotifier(String userId, boolean isInstant) {
        this.userId = userId;
        this.isInstant = isInstant;
    }
    @Override
    public void notify(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " send to " + this.userId + ". Is it instant ? " + this.isInstant);
    }
}
