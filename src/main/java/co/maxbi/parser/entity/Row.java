package co.maxbi.parser.entity;

import java.util.Date;

/**
 * POJO клас
 */
public class Row {

    private String id;
    private String name;
    private Date moment;
    private float sum;
    private Agent agent;


    public Row() {
    }

    public Row(String id, String name, Date moment, float sum, Agent agent) {
        this.id = id;
        this.name = name;
        this.moment = moment;
        this.sum = sum;
        this.agent = agent;
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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
