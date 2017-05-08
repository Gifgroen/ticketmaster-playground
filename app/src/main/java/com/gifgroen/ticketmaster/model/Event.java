package com.gifgroen.ticketmaster.model;

import com.gifgroen.ticketmaster.model.base.Result;

import java.util.List;

/**
 * API model class describing a ticketmaster Event.
 */
public class Event extends Result<Object> {
    String type;
    double distance;
    String units;
    Location location;
    String id;
    String locale;
    String name;
    String description;
    String additionalInfo;
    String url;
    List<Image> images;

    // Dates dates;
    // Sales sales

    String info;
    String pleaseNote;

    // List<PriceRange> priceRanges

    // Promoter promoter;

    // SeatMap seatmap;

    // List<Classification> classifications;

    // Place place;

    // Object externalLinks;

    boolean test;

    @Override
    public String toString() {
        return Event.class.getSimpleName() + " (" + id + ") -> " + name;
    }

    class Location {
        double latitude;
        double longitude;
    }
}
