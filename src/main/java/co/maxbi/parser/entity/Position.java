package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Position {
    private Meta meta;

    public Position() {
    }

    public Position(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
