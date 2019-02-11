package co.maxbi.parser.entity.metainfo;

public class DocumentsMeta extends Meta {
    private double size;
    private double limit;
    private double offset;
    DocumentsMeta fsdf = new DocumentsMeta();


    public DocumentsMeta() {

    }

    public DocumentsMeta(double size, double limit, double offset) {
        this.size = size;
        this.limit = limit;
        this.offset = offset;
    }

    public DocumentsMeta(String href, String mediaType, double size, double limit, double offset) {
        super(href, mediaType);
        this.size = size;
        this.limit = limit;
        this.offset = offset;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }
}
