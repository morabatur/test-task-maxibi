package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class State {

    private Meta meta;

    public State() {
    }

    public State(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
