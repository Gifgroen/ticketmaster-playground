package com.gifgroen.ticketmaster.repos;

import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.gifgroen.ticketmaster.db.EventSearchDatabase;
import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.model.data.Event;
import com.gifgroen.ticketmaster.model.embedded.EventSearch;
import com.gifgroen.ticketmaster.network.interfaces.Discovery;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class EventRepository {
    private Discovery mService;            /* Retrofit mapped discovery network service(S). */
    private EventSearchDatabase mDatabase; /* Database components which provides Room dao(s). */

    @Inject
    EventRepository(Discovery service, EventSearchDatabase db) {
        mService = service;
        mDatabase = db;
    }

    public LiveData<List<Event>> allEvents() {
        refreshEvents();
        return mDatabase.eventSearchDao().selectAll();
    }

    public Observable<List<Event>> searchEvents(@NonNull final String keyword) {
        return convertToEvents(mService.searchEvents(keyword));
    }

    private void refreshEvents() {
        convertToEvents(mService.getEvents())
                .flatMapIterable(event -> event)
                .subscribeOn(Schedulers.io())
                .subscribe(event -> mDatabase.eventSearchDao().save(event));
    }

    public Observable<List<Event>> convertToEvents(Observable<Result<EventSearch>> searchResult) {
        return searchResult.map(Result::getEmbedded).map(EventSearch::getEvents);
    }
}
