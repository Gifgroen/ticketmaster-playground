package com.gifgroen.ticketmaster.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.gifgroen.ticketmaster.model.data.Event;
import com.gifgroen.ticketmaster.model.data.Image;

@Database(entities = {Event.class, Image.class}, version = 1)
public abstract class EventSearchDatabase extends RoomDatabase {
    public abstract EventSearchDao eventSearchDao();
}
