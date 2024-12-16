package task_4_Observer;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void notify(SystemAlert sysAl){
        for (Observer observer:
                observers) {
            observer.notify(sysAl);
        }
    }
    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public  void unsubscribe(Observer observer){
        observers.remove(observer);
    }
}
