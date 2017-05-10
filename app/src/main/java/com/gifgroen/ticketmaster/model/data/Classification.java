package com.gifgroen.ticketmaster.model.data;

import com.gifgroen.ticketmaster.model.data.classification.Genre;
import com.gifgroen.ticketmaster.model.data.classification.Segment;
import com.gifgroen.ticketmaster.model.data.classification.Type;

/**
 * Created by karsten on 10/05/2017.
 */
class Classification {
    boolean primary;
    Segment segment;
    Genre genre;
    Genre subGenre;
    Type type;
    Type subType;

    @Override
    public String toString() {
        return "Classification{" +
                "primary=" + primary +
                ", segment=" + segment +
                ", genre=" + genre +
                ", subGenre=" + subGenre +
                ", type=" + type +
                ", subType=" + subType +
                '}';
    }
}
