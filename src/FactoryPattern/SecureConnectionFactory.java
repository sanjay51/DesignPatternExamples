package FactoryPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class SecureConnectionFactory implements ConnectionFactory {
    @Override
    public Connection createConnection(Constants.ConnectionType connectionType) {
        switch (connectionType) {
            case DYNAMO_DB:
                return new SecureDynamoDBConnection();

            case ORACLE:
                return new SecureOracleConnection();

            default:
                return null;
        }
    }
}
