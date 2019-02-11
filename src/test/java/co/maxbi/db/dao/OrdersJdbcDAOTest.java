package co.maxbi.db.dao;

import co.maxbi.db.entity.Order;
import co.maxbi.parser.DateConvertor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OrdersJdbcDAOTest {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Date parse(String date){
        try {
            //"2019-02-11 11:11:11"
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Order testOrder = new Order("testId", "testName", "testDescriprion",
            parse("2019-02-11 11:11:11"), 300, "TEST-TEST");


    @AfterEach
    void removeTestOrderFromDB() {
        OrdersJdbcDAO ordersJdbcDAO = new OrdersJdbcDAO();
        boolean result = ordersJdbcDAO.remove(testOrder);
        assertTrue(result);
    }

    @Test
    void addTestOrderInDB() {
        OrdersJdbcDAO ordersJdbcDAO = new OrdersJdbcDAO();
        boolean result = ordersJdbcDAO.add(testOrder);
        assertTrue(result);
    }
}