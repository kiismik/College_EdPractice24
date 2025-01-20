package task_4_Store;

import java.util.ArrayList;

public class StoreController extends Observable {
    private ArrayList<StoreNotification> notificationHistory = new ArrayList<>();

    public void addNotification(StoreNotification notification) {
        notificationHistory.add(notification);
    }

    public void dispatchNotifications() {
        if (!notificationHistory.isEmpty()) {
            for (StoreNotification notification : notificationHistory) {
                notify(notification);
            }
            notificationHistory.clear();
        } else {
            System.out.println("No notifications to dispatch.");
        }
    }
}