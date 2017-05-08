package com.gifgroen.ticketmaster.model.base;

import com.gifgroen.ticketmaster.model.meta.LinkMeta;
import com.gifgroen.ticketmaster.model.meta.PageMeta;

/**
 * Created by karsten on 08/05/2017.
 */
public class Result<T> {
    public LinkMeta _links;
    public T _embedded;
    public PageMeta page;

    public String toString() {
        return page + " -> " + _embedded;
    }
}
