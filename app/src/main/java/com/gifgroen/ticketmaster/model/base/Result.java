package com.gifgroen.ticketmaster.model.base;

import com.gifgroen.ticketmaster.model.meta.LinkMeta;
import com.gifgroen.ticketmaster.model.meta.PageMeta;
import com.google.gson.annotations.SerializedName;

/**
 * Created by karsten on 08/05/2017.
 */
public class Result<T> {
    @SerializedName("_links")
    public LinkMeta links;

    @SerializedName("_embedded")
    public T embedded;

    public PageMeta page;

    @Override
    public String toString() {
        return Result.class.getSimpleName() + " -> " + embedded;
    }
}
