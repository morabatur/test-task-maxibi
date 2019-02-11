package co.maxbi.parser;

import co.maxbi.db.dao.OrdersJdbcDAO;
import co.maxbi.db.entity.Order;
import co.maxbi.parser.entity.JsonData;
import co.maxbi.parser.entity.Row;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Клас для фільтрації вхідної інформації
 */
public class DataFilter {
    private static final Logger log = Logger.getLogger(DataFilter.class.getName());

    /**
     * Метод дозволяє відфільтрувати отриманий набір об'єктів за датою, наявністю та сформувати окремий набір
     * @param jsonData
     * @param testSetOrderId
     * @return List
     */
    public static List<Row> filterJSON(JsonData jsonData, Set<String> testSetOrderId) {
        Stream<Row> stream = Arrays.stream(jsonData.getRows());

        List<Row> rowList = stream.filter(row -> row.getMoment().after(DateConvertor.todayMidnight()))
                .filter(row -> !testSetOrderId.contains(row.getId()))
                .collect(Collectors.toList());

        log.info("Successful filter JSON data");

        return rowList;
    }
}


