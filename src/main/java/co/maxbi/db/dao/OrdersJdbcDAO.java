package co.maxbi.db.dao;

import co.maxbi.db.connector.ConnectorDAO;
import co.maxbi.db.dao.interfaces.OrdersDAO;
import co.maxbi.db.entity.Order;
import co.maxbi.parser.DateConvertor;

import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Клас для роботи з Замовленнями
 */
public class OrdersJdbcDAO implements OrdersDAO {

    private static final Logger log = Logger.getLogger(OrdersJdbcDAO.class.getName());


    /**
     * Метод дозволяє додати одного клієнта в базу
     * @param order
     * @return boolean
     */
    @Override
    public boolean add(Order order) {

        Connection connection = new ConnectorDAO().conect();
        String insertOneSql = "INSERT  INTO Roman.Orders VALUES(?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertOneSql)) {

            preparedStatement.setString(1, order.getId());
            preparedStatement.setString(2, order.getName());
            preparedStatement.setString(3, order.getDescription());
            preparedStatement.setString(4, DateConvertor.dateFormat(order.getMoment()));
            preparedStatement.setFloat(5, order.getSum());
            preparedStatement.setString(6, order.getCounterparty_uuid());

            preparedStatement.executeUpdate();

            connection.close();
            log.info("Successful insert order " + order.getId() + " row");
            return true;

        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Cant insert into table. Exception: ", ex);
            return false;
        }


    }

    /**
     * Метод доволяє додати одразу список клієнтів в базу даних
     * @param orders
     * @return boolean
     */
    public boolean add(List<Order> orders) {
        Connection connection = new ConnectorDAO().conect();
        String insertSql = "INSERT  INTO Roman.Orders VALUES(?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {

            for (Order order : orders) {
                preparedStatement.setString(1, order.getId());
                preparedStatement.setString(2, order.getName());
                preparedStatement.setString(3, order.getDescription());
                preparedStatement.setString(4, DateConvertor.dateFormat(order.getMoment()));
                preparedStatement.setFloat(5, order.getSum());
                preparedStatement.setString(6, order.getCounterparty_uuid());

                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
            connection.close();

            log.info("Successful insert " + orders.size() + " row");

            return true;
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Cant insert into table. Exception: ", ex);
            return false;
        }


    }

    /**
     * Метод дозволяє отримати список id (Orders) замовлень
     * @return
     */
    @Override
    public Set<String> idOrdersSet() {
        Connection connection = new ConnectorDAO().conect();
        Set<String> idSet = new HashSet<>();

        String selectIdOrder = "SELECT id FROM Roman.Orders";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectIdOrder)) {

            while (resultSet.next()) {

                idSet.add(resultSet.getString(1));
            }

            connection.close();
            log.info("Successful select " + idSet.size());
        } catch (SQLException e) {
            log.log(Level.SEVERE, "Fail " + selectIdOrder + ". Exception: ", e);
        }

        return idSet;
    }

    /**
     * Метод дозволяє видалити одне замовлення з бази boolean
     * @param order
     * @return
     */
    @Override
    public boolean remove(Order order) {
        Connection connection = new ConnectorDAO().conect();
        String deleteSql = "DELETE FROM Roman.Orders WHERE Roman.Orders.id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
            preparedStatement.setString(1, order.getId());
            preparedStatement.executeUpdate();

            connection.close();
            log.info("Successful delete order " + order.getId() + " row");
            return true;

        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Cant delete from table. Exception: ", ex);
            return false;
        }

    }
}
