package com.gifgroen.ticketmaster.model.internal;

import com.gifgroen.ticketmaster.model.base.BaseField;

/**
 * Created by karsten on 10/05/2017.
 */
public class Promoter extends BaseField {
    String description;

    @Override
    public String toString() {
        return "Promoter{" +
                ", description='" + description + '\'' +
                '}';
    }
}
