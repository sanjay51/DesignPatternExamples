package ObserverPattern.Custom;

import org.testng.annotations.Test;

/**
 * Created by sanjav on 5/14/16.
 */
public class test {

    @Test
    public void testPattern() {
        Database database = new Database();

        ClientObserver clientObserver = new ClientObserver();
        database.addObserver(clientObserver);

        CEOObserver ceoObserver = new CEOObserver();
        database.addObserver(ceoObserver);

        ArchieverObserver archieverObserver = new ArchieverObserver();
        database.addObserver(archieverObserver);

        database.editRecord("Customer_Address_Home");
    }
}
