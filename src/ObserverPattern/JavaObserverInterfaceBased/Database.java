package ObserverPattern.JavaObserverInterfaceBased;

import java.util.Observable;

/**
 * Created by sanjav on 5/14/16.
 */
public class Database extends Observable {
    private String operation;
    private String record;

    public void editRecord(String record) {
        //some database operation here;
        this.operation = "EDIT_DB_RECORD";
        this.record = record;

        this.setChanged();
        this.notifyObservers();
    }

    public String getOperation() {
        return this.operation;
    }

    public String getRecord() {
        return this.record;
    }
}
