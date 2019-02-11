package co.maxbi.parser.entity;

/**
 * POJO клас
 */
public class Rate {
    private Currency currency;

    public Rate() {
    }

    public Rate(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
