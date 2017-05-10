package com.gifgroen.ticketmaster.model.base;

import com.gifgroen.ticketmaster.model.meta.LinkMeta;
import com.gifgroen.ticketmaster.model.meta.PageMeta;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by karsten on 08/05/2017.
 */
public class Result<T> {
    @SerializedName("_links")
    LinkMeta links;
    @SerializedName("_embedded")
    T embedded;
    PageMeta page;
    ExternalLinks externalLinks;
    boolean test;

    public T getEmbedded() {
        return embedded;
    }

    @Override
    public String toString() {
        return "Result{" +
                "links=" + links +
                ", embedded=" + embedded +
                ", page=" + page +
                ", test=" + test +
                '}';
    }

    class ExternalLinks {
        List<LinkItem> youtube;
        List<LinkItem> twitter;
        List<LinkItem> itunes;
        List<LinkItem> lastfm;
        List<LinkItem> facebook;
        List<LinkItem> wiki;
        List<LinkItem> instagram;
        List<LinkItem> musicbrainz;
        List<LinkItem> homepage;

        class LinkItem {
            String url;
            String id; // only existing for musicbrainz
        }

    }
}
