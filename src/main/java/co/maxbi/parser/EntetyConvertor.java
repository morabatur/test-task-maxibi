package co.maxbi.parser;

import co.maxbi.db.dao.OrdersJdbcDAO;
import co.maxbi.db.entity.Order;
import co.maxbi.parser.entity.Row;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Клас для конвертації об'єктів отриманих з JSON в POJO об'єкти підходящі для вставки в базу
 */
public class EntetyConvertor {

    private static final Logger log = Logger.getLogger(OrdersJdbcDAO.class.getName());


    private Row row;
    private Order order;

    public EntetyConvertor(Row row, Order order) {
        this.row = row;
        this.order = order;
    }

    public EntetyConvertor() {
    }

    /**
     * Метод дозволяє конвертувати об'єкт типу Row в Order
     * @param convertedRow
     * @return
     */
    public Order rowToOrder(Row convertedRow) {
        Order convertedOrder = new Order();

        convertedOrder.setId(convertedRow.getId());
        convertedOrder.setName(convertedRow.getName());
        convertedOrder.setDescription("EMPTY");
        convertedOrder.setMoment(convertedRow.getMoment());
        convertedOrder.setSum(convertedRow.getSum());

        String uuid = agentUuid(convertedRow.getAgent().getMeta().getHref());

        convertedOrder.setCounterparty_uuid(uuid);

        return convertedOrder;

    }

    /**
     * Метод дозволяє конвертувати набір даних типу Row в Order
     * @param convertedList
     * @return
     */
    public List<Order> rowToOrder(List<Row> convertedList) {
        List<Order> orderList = new ArrayList<>();
        for (Row row : convertedList) {
           orderList.add(rowToOrder(row));
        }

        log.info("Convert " + convertedList.size() + " Row object in Order");


        return orderList;
    }


    /**
     * Метод дозволяє отримати дані про Uuid клієнта
     * @param href
     * @return
     */
    private String agentUuid(String href) {
        return href.replace("https://online.moysklad.ru/api/remap/1.1/entity/counterparty/", "");
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
