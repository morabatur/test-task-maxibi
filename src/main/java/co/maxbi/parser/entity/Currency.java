package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Currency {
    private Meta meta;

    public Currency() {
    }

    public Currency(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
