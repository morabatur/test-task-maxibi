package co.maxbi.entity;

public class Organization {
    private Meta meta;


    public Organization() {
    }

    public Organization(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
