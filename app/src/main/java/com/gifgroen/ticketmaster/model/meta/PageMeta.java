package com.gifgroen.ticketmaster.model.meta;

/**
 * Created by karsten on 08/05/2017.
 */

public class PageMeta {
    int size;
    int totalElements;
    int totalPages;
    int number;

    public String toString() {
        return "There are " + totalPages + " pages with size = " + size;
    }
}
