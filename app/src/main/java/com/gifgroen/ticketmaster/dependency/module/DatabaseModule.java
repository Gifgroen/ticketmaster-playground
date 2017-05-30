package com.gifgroen.ticketmaster.dependency.module;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.gifgroen.ticketmaster.db.EventSearchDao;
import com.gifgroen.ticketmaster.db.EventSearchDatabase;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {
    private Context mContext;

    public DatabaseModule(Context context) {
        mContext = context;
    }

    @Provides
    EventSearchDatabase providesEventSearchDatabase() {
        return Room.databaseBuilder(mContext, EventSearchDatabase.class, "event-search").build();
    }

    @Provides
    EventSearchDao providesSearchDao(EventSearchDatabase database) {
        return database.eventSearchDao();
    }
}
