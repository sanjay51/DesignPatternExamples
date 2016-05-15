package FactoryPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class SecureDynamoDBConnection implements Connection {
    @Override
    public String getDescription() {
        return "Secure DynamoDBConnection";
    }
}
