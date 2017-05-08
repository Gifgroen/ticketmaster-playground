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

    @Override
    public String toString() {
        return Result.class.getSimpleName() + " -> " + _embedded;
    }
}
