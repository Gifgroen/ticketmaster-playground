package com.gifgroen.ticketmaster.model.data.place;

import com.gifgroen.ticketmaster.model.base.BaseField;

/**
 * Created by karsten on 10/05/2017.
 */
public class Country extends BaseField {
    String countryCode;

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                '}';
    }
}
