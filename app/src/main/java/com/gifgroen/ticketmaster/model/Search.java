package com.gifgroen.ticketmaster.model;


import com.gifgroen.ticketmaster.model.base.Result;

import java.util.List;

/**
 * Created by karsten on 08/05/2017.
 */

public class Search extends Result {
    List<Event> events;

    public String toString() {
        return events.toString();
    }
}
