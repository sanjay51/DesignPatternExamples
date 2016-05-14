package ObserverPattern.Custom;

/**
 * Created by sanjav on 5/14/16.
 */
public class ClientObserver implements Observer {

    @Override
    public void notify(String operation, String record) {
        System.out.println("Client notified for operation " + operation + " and record " + record);
    }
}
