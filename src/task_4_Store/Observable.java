package task_4_Store;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void notify(StoreNotification notification) {
        for (Observer observer : observers) {
            observer.notify(notification);
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
