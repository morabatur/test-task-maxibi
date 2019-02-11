package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Documents {
    private Meta meta;

    public Documents() {
    }

    public Documents(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
