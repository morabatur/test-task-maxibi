package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Agent {
    private Meta meta;

    public Agent() {
    }

    public Agent(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
