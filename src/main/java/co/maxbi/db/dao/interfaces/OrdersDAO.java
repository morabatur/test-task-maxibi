package co.maxbi.db.dao.interfaces;

import co.maxbi.db.entity.Order;

import java.util.List;
import java.util.Set;

public interface OrdersDAO {
    boolean add(Order order);
    boolean add(List<Order> order);

    Set<String> idOrdersSet();


    boolean remove(Order order);
}
