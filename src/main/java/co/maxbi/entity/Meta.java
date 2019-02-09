package co.maxbi.entity;

public class Meta {
    //Must
    private String href;
    private String metadataHref;
    private String type;
    private String mediaType;

    //Oprional
    private String uuidHref;
    private double size;
    private double limit;
    private double offset;



    public Meta() {
    }

    public Meta(String href, String metadataHref, String type, String mediaType) {
        this.href = href;
        this.metadataHref = metadataHref;
        this.type = type;
        this.mediaType = mediaType;
    }

    public Meta(double size, double limit, double offset) {
        this.size = size;
        this.limit = limit;
        this.offset = offset;
    }


    //TODO Переписати конструктор з використанням this
    public Meta(String href, String mediaType, double size, double limit, double offset) {
        this.href = href;
        this.mediaType = mediaType;
        this.size = size;
        this.limit = limit;
        this.offset = offset;
    }

    public Meta(String href, String type, String mediaType, double size, double limit, double offset) {
        this.href = href;
        this.type = type;
        this.mediaType = mediaType;
        this.size = size;
        this.limit = limit;
        this.offset = offset;
    }

    public Meta(String href, String metadataHref, String type, String mediaType, String uuidHref) {
        this.href = href;
        this.metadataHref = metadataHref;
        this.type = type;
        this.mediaType = mediaType;
        this.uuidHref = uuidHref;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getMetadataHref() {
        return metadataHref;
    }

    public void setMetadataHref(String metadataHref) {
        this.metadataHref = metadataHref;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getUuidHref() {
        return uuidHref;
    }

    public void setUuidHref(String uuidHref) {
        this.uuidHref = uuidHref;
    }


    @Override
    public String toString() {
        return "metainfo{" +
                "href='" + href + '\'' +
                ", metadataHref='" + metadataHref + '\'' +
                ", type='" + type + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", uuidHref='" + uuidHref + '\'' +
                ", size=" + size +
                ", limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
