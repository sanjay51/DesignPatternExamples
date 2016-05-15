package FactoryPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class OracleConnection implements Connection {
    @Override
    public String getDescription() {
        return "Unsecure Oracle Connection";
    }
}
