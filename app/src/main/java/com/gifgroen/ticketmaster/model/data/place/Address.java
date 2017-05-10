package com.gifgroen.ticketmaster.model.data.place;

/**
 * Created by karsten on 10/05/2017.
 */
public class Address {
    String line1;
    String line2;
    String line3;

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", line3='" + line3 + '\'' +
                '}';
    }
}
