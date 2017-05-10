package com.gifgroen.ticketmaster.model.data;

import com.gifgroen.ticketmaster.model.base.BaseField;
import com.gifgroen.ticketmaster.model.data.place.Address;
import com.gifgroen.ticketmaster.model.data.place.Area;
import com.gifgroen.ticketmaster.model.data.place.City;
import com.gifgroen.ticketmaster.model.data.place.State;
import com.gifgroen.ticketmaster.model.data.place.Country;
import com.gifgroen.ticketmaster.model.internal.Location;

/**
 * Created by karsten on 10/05/2017.
 */
public class Place extends BaseField {
    Area area;
    Address address;
    City city;
    State state;
    Country country;
    String postalCode;
    Location location;

    @Override
    public String toString() {
        return "Place{" +
                "area=" + area +
                ", address=" + address +
                ", city=" + city +
                ", state=" + state +
                ", country=" + country +
                ", postalCode='" + postalCode + '\'' +
                ", location=" + location +
                '}';
    }
}
