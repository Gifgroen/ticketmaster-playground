package com.gifgroen.ticketmaster.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.gifgroen.ticketmaster.model.data.Event;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by karsten on 22/05/2017.
 */
@Dao
public interface EventSearchDao {
    @Query("SELECT * from Event")
    LiveData<List<Event>> loadAll();

    @Insert(onConflict = REPLACE)
    void save(Event event);
}
