package FactoryPattern;

import org.testng.annotations.Test;
import FactoryPattern.Constants.*;

/**
 * Created by sanjav on 5/15/16.
 */
public class test {

    @Test
    public void testPattern() {
        ConnectionFactory secureConnectionFactory = new SecureConnectionFactory();
        ConnectionFactory unsecureConnectionFactory = new UnsecureConnectionFactory();

        Connection secureOracleConnection = secureConnectionFactory.createConnection(ConnectionType.ORACLE);
        System.out.println(secureOracleConnection.getDescription());

        Connection secureDynamoDBConnection = secureConnectionFactory.createConnection(ConnectionType.DYNAMO_DB);
        System.out.println(secureDynamoDBConnection.getDescription());

        Connection unsecureOracleConnection = unsecureConnectionFactory.createConnection(ConnectionType.ORACLE);
        System.out.println(unsecureOracleConnection.getDescription());

        Connection unsecureDynamoDBConnection = unsecureConnectionFactory.createConnection(ConnectionType.DYNAMO_DB);
        System.out.println(unsecureDynamoDBConnection.getDescription());
    }
}
