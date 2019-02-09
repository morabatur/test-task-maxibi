package co.maxbi.entity;


import java.util.Date;

public class Row {
   // private Meta meta;
    private String id;
    private String accountId;
    private Owner owner;
    private boolean shared;
    private Group group;
    private int version;
    private Date updated;
    private String name;
    private String externalCode;
    private String moment;
    private boolean applicable;
    private Rate rate;
    private float sum;
    private Store store;
    private Agent agent;
    private Organization organization;
    private State state;
    private Documents documents;
    private Date created;
    private Position positions;
    private boolean vatEnabled;
    private boolean vatIncluded;
    private float vatSum;
    private float payedSum;
    private float shippedSum;
    private float invoicedSum;
    private float reservedSum;


    public Row() {
    }

    public Row(/*Meta meataDataRow,*/ String id, String accountId, Owner owner, boolean shared, Group group, int version,
               Date updated, String name, String externalCode, String moment, boolean applicable, Rate rate, float sum,
               Store store, Agent agent, Organization organization, State state, Documents doc, Date created,
               Position position, boolean vatEnabled, boolean vatIncluded, float vatSum, float payedSum,
               float shippedSum, float invoicedSum, float reservedSum) {
       // this.meta = meataDataRow;
        this.id = id;
        this.accountId = accountId;
        this.owner = owner;
        this.shared = shared;
        this.group = group;
        this.version = version;
        this.updated = updated;
        this.name = name;
        this.externalCode = externalCode;
        this.moment = moment;
        this.applicable = applicable;
        this.rate = rate;
        this.sum = sum;
        this.store = store;
        this.agent = agent;
        this.organization = organization;
        this.state = state;
        this.documents = doc;
        this.created = created;
        this.positions = position;
        this.vatEnabled = vatEnabled;
        this.vatIncluded = vatIncluded;
        this.vatSum = vatSum;
        this.payedSum = payedSum;
        this.shippedSum = shippedSum;
        this.invoicedSum = invoicedSum;
        this.reservedSum = reservedSum;
    }
//
//    public Meta getMeta() {
//        return meta;
//    }
//
//    public void setMeta(Meta meta) {
//        this.meta = meta;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public boolean isApplicable() {
        return applicable;
    }

    public void setApplicable(boolean applicable) {
        this.applicable = applicable;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Documents getDocuments() {
        return documents;
    }

    public void setDocuments(Documents documents) {
        this.documents = documents;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Position getPositions() {
        return positions;
    }

    public void setPositions(Position positions) {
        this.positions = positions;
    }

    public boolean isVatEnabled() {
        return vatEnabled;
    }

    public void setVatEnabled(boolean vatEnabled) {
        this.vatEnabled = vatEnabled;
    }

    public boolean isVatIncluded() {
        return vatIncluded;
    }

    public void setVatIncluded(boolean vatIncluded) {
        this.vatIncluded = vatIncluded;
    }

    public float getVatSum() {
        return vatSum;
    }

    public void setVatSum(float vatSum) {
        this.vatSum = vatSum;
    }

    public float getPayedSum() {
        return payedSum;
    }

    public void setPayedSum(float payedSum) {
        this.payedSum = payedSum;
    }

    public float getShippedSum() {
        return shippedSum;
    }

    public void setShippedSum(float shippedSum) {
        this.shippedSum = shippedSum;
    }

    public float getInvoicedSum() {
        return invoicedSum;
    }

    public void setInvoicedSum(float invoicedSum) {
        this.invoicedSum = invoicedSum;
    }

    public float getReservedSum() {
        return reservedSum;
    }

    public void setReservedSum(float reservedSum) {
        this.reservedSum = reservedSum;
    }


    @Override
    public String toString() {
        return "Row{" +
//                "meta=" + meta +
                ", id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", owner=" + owner +
                ", shared=" + shared +
                ", group=" + group +
                ", version=" + version +
                ", updated=" + updated +
                ", name='" + name + '\'' +
                ", externalCode='" + externalCode + '\'' +
                ", moment='" + moment + '\'' +
                ", applicable=" + applicable +
                ", rate=" + rate +
                ", sum=" + sum +
                ", store=" + store +
                ", agent=" + agent +
                ", organization=" + organization +
                ", state=" + state +
                ", documents=" + documents +
                ", created=" + created +
                ", positions=" + positions +
                ", vatEnabled=" + vatEnabled +
                ", vatIncluded=" + vatIncluded +
                ", vatSum=" + vatSum +
                ", payedSum=" + payedSum +
                ", shippedSum=" + shippedSum +
                ", invoicedSum=" + invoicedSum +
                ", reservedSum=" + reservedSum +
                '}';
    }
}
