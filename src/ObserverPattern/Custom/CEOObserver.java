package ObserverPattern.Custom;

/**
 * Created by sanjav on 5/14/16.
 */
public class CEOObserver implements Observer {
    @Override
    public void notify(String operation, String record) {
        System.out.println("CEO notified for operation " + operation + " and record " + record);
    }
}
