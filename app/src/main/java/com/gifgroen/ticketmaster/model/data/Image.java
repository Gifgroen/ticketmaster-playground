package com.gifgroen.ticketmaster.model.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * API model class describing a ticketmaster image.
 */
@Entity(
    foreignKeys = @ForeignKey(entity = Event.class, parentColumns = "id", childColumns = "event_id"),
    indices = @Index(value = "event_id")
)
public class Image {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "event_id")
    public int eventId;

    public String url;
    public String ratio;
    public int width;
    public int height;
    public boolean fallback;
    public String attribution;

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
