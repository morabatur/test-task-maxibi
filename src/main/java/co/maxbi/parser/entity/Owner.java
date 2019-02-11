package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Owner {
    private Meta meta;

    public Owner() {
    }

    public Owner(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
