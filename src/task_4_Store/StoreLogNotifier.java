package task_4_Store;

public class StoreLogNotifier implements Observer {
    private String logName;

    public StoreLogNotifier(String logName) {
        this.logName = logName;
    }

    @Override
    public void notify(StoreNotification notification) {
        System.out.println(notification.toString() + " logged in " + this.logName);
    }
}