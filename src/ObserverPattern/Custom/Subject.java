package ObserverPattern.Custom;

/**
 * Created by sanjav on 5/14/16.
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
