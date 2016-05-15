package FactoryPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class UnsecureConnectionFactory implements ConnectionFactory {
    @Override
    public Connection createConnection(Constants.ConnectionType connectionType) {
        switch (connectionType) {
            case ORACLE:
                return new OracleConnection();

            case DYNAMO_DB:
                return new DynamoDBConnection();

            default:
                return null;
        }
    }
}
