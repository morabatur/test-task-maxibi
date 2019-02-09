package co.maxbi.entity.metainfo;

public class Meta {
    private String href;
    private String metadataHref;
    private String type;
    private String mediaType;


    public Meta() {
    }

    public Meta(String href, String metadataHref, String type, String mediaType) {
        this.href = href;
        this.metadataHref = metadataHref;
        this.type = type;
        this.mediaType = mediaType;
    }

    public Meta(String href, String mediaType) {
        this.href = href;
        this.mediaType = mediaType;
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
}
