package task_4_Store;

public class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(StoreNotification notification) {
        System.out.println(notification.toString() + " sent to phone number: " + this.phoneNumber);
    }
}