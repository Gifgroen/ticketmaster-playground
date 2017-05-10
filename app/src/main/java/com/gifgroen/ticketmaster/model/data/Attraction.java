package com.gifgroen.ticketmaster.model.data;

import com.gifgroen.ticketmaster.model.base.Result;

import java.util.List;

/**
 * Created by karsten on 10/05/2017.
 */
public class Attraction extends Result {
    String type;
    String id;
    String locale;
    String name;
    String description;
    String additionalInfo;
    String url;
    List<Image> images;
    List<Classification> classifications;

    @Override
    public String toString() {
        return "Attraction{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", locale='" + locale + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", url='" + url + '\'' +
                ", images=" + images +
                ", classifications=" + classifications +
                '}';
    }
}
