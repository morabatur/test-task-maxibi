package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Group {
private Meta meta;

    public Group() {
    }

    public Group(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
