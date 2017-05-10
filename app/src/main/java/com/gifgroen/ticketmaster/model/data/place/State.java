package com.gifgroen.ticketmaster.model.data.place;

import com.gifgroen.ticketmaster.model.base.BaseField;

/**
 * Created by karsten on 10/05/2017.
 */
public class State extends BaseField {
    String stateCode;

    @Override
    public String toString() {
        return "State{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
