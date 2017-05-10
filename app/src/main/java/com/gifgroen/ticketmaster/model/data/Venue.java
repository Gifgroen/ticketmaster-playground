package com.gifgroen.ticketmaster.model.data;

import com.gifgroen.ticketmaster.model.base.BaseField;
import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.model.data.place.Address;
import com.gifgroen.ticketmaster.model.data.place.City;
import com.gifgroen.ticketmaster.model.data.place.Country;
import com.gifgroen.ticketmaster.model.data.place.State;
import com.gifgroen.ticketmaster.model.internal.Location;

import java.util.List;

/**
 * Created by karsten on 10/05/2017.
 */
public class Venue extends Result<Object> {
    double distance;
    String units;
    String id;
    String locale;
    String name;
    String description;
    Address address;
    City city;
    String additionalinfo;
    State state;
    Country country;
    String url;
    String postalCode;
    Location location;
    String timezone;
    String currency;
    List<BaseField> markets;    /* TODO: better mapping in the future! */
    List<Image> images;
    List<BaseField> dma;        /* TODO: better mapping in the future! */
    Social social;
    BoxOfficeInfo boxOfficeInfo;
    String parkingDetail;
    String accessibleSeatingDetail;
    GeneralInfo generalInfo;

    @Override
    public String toString() {
        return "Venue{" +
                "distance=" + distance +
                ", units='" + units + '\'' +
                ", id='" + id + '\'' +
                ", locale='" + locale + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                ", city=" + city +
                ", additionalinfo='" + additionalinfo + '\'' +
                ", state=" + state +
                ", country=" + country +
                ", url='" + url + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", location=" + location +
                ", timezone='" + timezone + '\'' +
                ", currency='" + currency + '\'' +
                ", markets=" + markets +
                ", images=" + images +
                ", dma=" + dma +
                ", social=" + social +
                ", boxOfficeInfo=" + boxOfficeInfo +
                ", parkingDetail='" + parkingDetail + '\'' +
                ", accessibleSeatingDetail='" + accessibleSeatingDetail + '\'' +
                ", generalInfo=" + generalInfo +
                '}';
    }

    class Social {
        Twitter twitter;

        class Twitter {
            String handle;
        }
    }

    class BoxOfficeInfo {
        String phoneNumberDetail;
        String openHoursDetail;
        String acceptedPaymentDetail;
        String willCallDetail;
    }

    class GeneralInfo {
        String generalRule;
        String childRule;
    }
}
