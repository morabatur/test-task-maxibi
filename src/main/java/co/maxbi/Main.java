package co.maxbi;

import co.maxbi.api.MaxbiRestConnector;
import co.maxbi.db.dao.OrdersJdbcDAO;
import co.maxbi.db.dao.interfaces.OrdersDAO;
import co.maxbi.parser.DataFilter;
import co.maxbi.parser.EntetyConvertor;
import co.maxbi.parser.GsonParser;
import co.maxbi.parser.entity.JsonData;
import co.maxbi.parser.entity.Row;
import com.google.gson.*;

import java.io.*;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        /**
         * Блок для даних авторизації
         */
        String url = "https://online.moysklad.ru/api/remap/1.1/entity/customerorder";
        String login = "admin@max69";
        String password = "61ae20975e";

        /**
         * Створення ГСОН парсеру з відповідим форматуванням дати
         */
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        /**
         * Зчитування інформації з рест апі
         */
        InputStream inputStream = null;
        try {
            inputStream = new MaxbiRestConnector().connect(login, password, url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /***
         * Створення парсеру для обробки інформації
         */
        GsonParser parser = new GsonParser(gson, inputStream);
        JsonData data = parser.jsonParser();

        /**
         * Отримання інформації з БД про наявні замовлення
         */

        OrdersDAO orders = new OrdersJdbcDAO();
        Set<String> idOrdersSet = orders.idOrdersSet();

        /**
         * Фільтрація інформації та запис в лист
         */
        List<Row> actualRowList = DataFilter.filterJSON(data, idOrdersSet);


        /**
         * Перетворення ROW в Order
         */

        EntetyConvertor entetyConvertor = new EntetyConvertor();

        /**
         * Додавання в базу
         */
        orders.add(entetyConvertor.rowToOrder(actualRowList));


    }
}
