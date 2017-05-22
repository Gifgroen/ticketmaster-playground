package com.gifgroen.ticketmaster.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.gifgroen.ticketmaster.model.data.Event;

/**
 * Created by karsten on 22/05/2017.
 */
@Database(entities = {Event.class}, version = 1)
public abstract class EventSearchDatabase extends RoomDatabase {
    public abstract EventSearchDao eventSearchDao();
}
