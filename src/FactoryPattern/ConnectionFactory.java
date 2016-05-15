package FactoryPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public interface ConnectionFactory {
    public Connection createConnection(Constants.ConnectionType connectionType);
}
