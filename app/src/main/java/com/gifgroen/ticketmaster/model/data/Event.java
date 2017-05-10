package com.gifgroen.ticketmaster.model.data;

import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.model.embedded.EventLocation;
import com.gifgroen.ticketmaster.model.internal.Dates;
import com.gifgroen.ticketmaster.model.internal.Location;
import com.gifgroen.ticketmaster.model.internal.PriceRange;
import com.gifgroen.ticketmaster.model.internal.Promoter;
import com.gifgroen.ticketmaster.model.internal.Sales;
import com.gifgroen.ticketmaster.model.internal.SeatMap;

import java.util.List;

/**
 * API model class describing a ticketmaster Event.
 */
public class Event extends Result<EventLocation> {
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
    Dates dates;
    Sales sales;
    String info;
    String pleaseNote;
    List<PriceRange> priceRanges;
    Promoter promoter;
    SeatMap seatmap;
    List<Classification> classifications;
    Place place;

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                ", distance=" + distance +
                ", units='" + units + '\'' +
                ", location=" + location +
                ", id='" + id + '\'' +
                ", locale='" + locale + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", url='" + url + '\'' +
                ", images=" + images +
                ", dates=" + dates +
                ", sales=" + sales +
                ", info='" + info + '\'' +
                ", pleaseNote='" + pleaseNote + '\'' +
                ", priceRanges=" + priceRanges +
                ", promoter=" + promoter +
                ", seatmap=" + seatmap +
                ", classifications=" + classifications +
                ", place=" + place +
                '}';
    }
}
