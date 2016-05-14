package ObserverPattern.JavaObserverInterfaceBased;

import org.testng.annotations.Test;

/**
 * Created by sanjav on 5/14/16.
 */
public class test {
    Database database = new Database();

    @Test
    public void testPattern() {
        ClientObserver clientObserver = new ClientObserver();
        database.addObserver(clientObserver);

        CEOObserver ceoObserver = new CEOObserver();
        database.addObserver(ceoObserver);

        ArchieverObserver archieverObserver = new ArchieverObserver();
        database.addObserver(archieverObserver);
        database.addObserver(archieverObserver); //let's see if Archiever is notified twice => NO

        database.editRecord("Customer_Address_Home");

        //CEO is now sick of so many updates
        database.deleteObserver(ceoObserver);
        database.editRecord("Customer_Name_Change");
    }
}
