package co.maxbi.db.entity;

import java.util.Date;
import java.util.Objects;

/**
 * POJO клас
 */
public class Order {
    private String id;
    private String name;
    private String description;
    private Date moment;
    private float sum;
    private String counterparty_uuid;

    public Order() {
    }

    public Order(String id, String name, String description, Date moment, float sum, String counterparty_uuid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.moment = moment;
        this.sum = sum;
        this.counterparty_uuid = counterparty_uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getCounterparty_uuid() {
        return counterparty_uuid;
    }

    public void setCounterparty_uuid(String counterparty_uuid) {
        this.counterparty_uuid = counterparty_uuid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", moment=" + moment +
                ", sum=" + sum +
                ", counterparty_uuid='" + counterparty_uuid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Float.compare(order.sum, sum) == 0 &&
                Objects.equals(id, order.id) &&
                Objects.equals(name, order.name) &&
                Objects.equals(description, order.description) &&
                Objects.equals(moment, order.moment) &&
                Objects.equals(counterparty_uuid, order.counterparty_uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, moment, sum, counterparty_uuid);
    }
}
