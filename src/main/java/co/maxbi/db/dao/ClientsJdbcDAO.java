package co.maxbi.db.dao;

import co.maxbi.db.connector.ConnectorDAO;
import co.maxbi.db.dao.interfaces.ClientsDAO;
import co.maxbi.db.entity.Client;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Клас для роботи з Клієнтами
 */
public class ClientsJdbcDAO implements ClientsDAO {
    private static final Logger log = Logger.getLogger(ClientsJdbcDAO.class.getName());

    private ConnectorDAO connectorDAO;

    /**
     * Метод дозволяє додати одного клієнта в базу
     *
     * @param client
     * @return boolean
     */
    @Override
    public boolean add(Client client) {
        Connection connection = new ConnectorDAO().conect();
        String insertOneSql = "INSERT  INTO Roman.Clients VALUES(?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertOneSql)) {

            preparedStatement.setString(1, client.getId());
            preparedStatement.setString(2, client.getName());

            preparedStatement.executeUpdate();

            connection.close();
            log.info("Successful insert clent " + client.getName() + " row");
            return true;

        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Cant insert into table. Exception: ", ex);
            return false;
        }


    }

    /**
     * Метод дозволяє видалити клієнта з бази використовуючи його унікальний id
     *
     * @param client
     * @return boolean
     */
    @Override
    public boolean remove(Client client) {
        Connection connection = new ConnectorDAO().conect();
        String deleteSql = "DELETE FROM Roman.Clients WHERE Roman.Clients.id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
            preparedStatement.setString(1, client.getId());
            preparedStatement.executeUpdate();

            connection.close();
            log.info("Successful delete client " + client.getName() + " row");
            return true;

        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Cant delete from table. Exception: ", ex);
            return false;
        }

    }

    /**
     * Метод дозволяє отримати список всіх клієнтів
     *
     * @return Set<Client>
     */
    @Override
    public Set<Client> allClients() {
        connectorDAO = new ConnectorDAO();
        Connection connection = connectorDAO.conect();
        Set<Client> clientSet = new HashSet<>();
        String selectSql = "SELECT * FROM Roman.Clients";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSql)) {

            while (resultSet.next()) {
                clientSet.add(new Client(resultSet.getString(1), resultSet.getString(2)));
            }

            connection.close();

            log.info("Successful sql query " + selectSql);
        } catch (SQLException e) {
            log.log(Level.SEVERE, "Fail " + selectSql + ". Exception: ", e);
        }

        return clientSet;
    }
}
