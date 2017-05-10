package com.gifgroen.ticketmaster.model.embedded;


import com.gifgroen.ticketmaster.model.data.Event;
import com.gifgroen.ticketmaster.model.base.Result;

import java.util.List;

/**
 * Created by karsten on 08/05/2017.
 */
public class EventSearch extends Result<EventLocation> {
    List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "EventSearch{" +
                "events=" + events +
                '}';
    }
}
