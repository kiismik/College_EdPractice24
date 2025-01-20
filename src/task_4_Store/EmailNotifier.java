package task_4_Store;

public class EmailNotifier implements Observer {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void notify(StoreNotification notification) {
        System.out.println(notification.toString() + " sent to email: " + this.email);
    }
}