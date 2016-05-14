package ObserverPattern.Custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sanjav on 5/14/16.
 */
public class Database implements Subject {
    private List<Observer> observers = new ArrayList<>();
    String operation;
    String record;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void editRecord(String record) {
        //some database operation here
        this.operation = "EDIT";
        this.record = record;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.notify(operation, record);
        }
    }
}
