package co.maxbi.entity;

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
