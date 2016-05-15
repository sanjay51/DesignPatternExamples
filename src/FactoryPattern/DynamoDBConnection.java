package FactoryPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class DynamoDBConnection implements Connection {
    @Override
    public String getDescription() {
        return "Unsecure DynamoDB connection.";
    }
}
