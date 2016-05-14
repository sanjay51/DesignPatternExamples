package ObserverPattern.JavaObserverInterfaceBased;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sanjav on 5/14/16.
 */
public class CEOObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Database db = (Database) o;
        System.out.println("CEO notified for operation " + db.getOperation() + " and record" + db.getRecord());
    }
}
