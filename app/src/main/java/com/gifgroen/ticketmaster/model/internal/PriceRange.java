package com.gifgroen.ticketmaster.model.internal;

/**
 * Created by karsten on 10/05/2017.
 */
public class PriceRange {
    String type;
    String currency;
    float min;
    float max;

    @Override
    public String toString() {
        return "PriceRange{" +
                "type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
