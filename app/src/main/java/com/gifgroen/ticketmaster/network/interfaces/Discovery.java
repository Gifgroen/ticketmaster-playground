package com.gifgroen.ticketmaster.network.interfaces;

import com.gifgroen.ticketmaster.model.Event;
import com.gifgroen.ticketmaster.model.EventSearch;
import com.gifgroen.ticketmaster.model.base.Result;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Service definition for the Discovery API.
 */
public interface Discovery {
    @GET("discovery/v2/events.json")
    Observable<Result<EventSearch>> getEvents();

    @GET("discovery/v2/events/{id}")
    Observable<Event> getDetails(@Path("id") String id);
}
