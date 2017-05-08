package com.gifgroen.ticketmaster.model.meta;

/**
 * Created by karsten on 08/05/2017.
 */

public class LinkMeta {
    public Link self;
    public Link next;
    public Link prev;

    class Link {
        public String href;
        public boolean templated;
    }
}
