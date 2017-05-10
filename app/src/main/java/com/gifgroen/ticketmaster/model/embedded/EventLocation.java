package com.gifgroen.ticketmaster.model.embedded;

import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.model.data.Attraction;
import com.gifgroen.ticketmaster.model.data.Venue;

import java.util.List;

/**
 * Created by karsten on 10/05/2017.
 */
public class EventLocation extends Result {
    List<Venue> venues;
    List<Attraction> attractions;

    public List<Attraction> getAttractions() {
        return attractions;
    }

    @Override
    public String toString() {
        return "EventLocation{" +
                "venues=" + venues +
                ", attraction=" + attractions +
                '}';
    }
}
