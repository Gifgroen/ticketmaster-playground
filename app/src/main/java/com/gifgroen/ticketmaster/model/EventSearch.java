package com.gifgroen.ticketmaster.model;


import com.gifgroen.ticketmaster.model.base.Result;

import java.util.List;

/**
 * Created by karsten on 08/05/2017.
 */

public class EventSearch extends Result {
    List<Event> events;

    @Override
    public String toString() {
        return EventSearch.class.getSimpleName() + " " + events;
    }
}
