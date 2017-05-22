package com.gifgroen.ticketmaster.model.internal;

/**
 * Created by karsten on 10/05/2017.
 */
public class Location {
    public double latitude;
    public double longitude;

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
