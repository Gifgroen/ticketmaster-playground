package com.gifgroen.ticketmaster.model.data;

/**
 * API model class describing a ticketmaster image.
 */
class Image {
    String url;
    String ratio;
    int width;
    int height;
    boolean fallback;
    String attribution;

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                ", ratio='" + ratio + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", fallback=" + fallback +
                ", attribution='" + attribution + '\'' +
                '}';
    }
}
