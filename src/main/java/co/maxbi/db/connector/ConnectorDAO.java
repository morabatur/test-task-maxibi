package co.maxbi.db.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Клас для роботи зі з'єднанням до БД
 */
public class ConnectorDAO {

    private static final Logger log = Logger.getLogger(ConnectorDAO.class.getName());

    private static final String hostName = "maxbicotest.database.windows.net";
    private static final String dbName = "testAzureSQL";
    private static final String user = "TestTask";
    private static final String password = "TestDev20191";
    private static final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);

    /**
     * Метод дозволяє встановити з'єднання з базою даних
     *
     * @return Connection
     */
    public Connection conect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);

            log.info("Successful connection to the database");
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Cant connect to database. Exception: ", ex);
        }

        return connection;
    }
}
