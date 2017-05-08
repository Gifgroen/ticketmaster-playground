package com.gifgroen.ticketmaster.network.interfaces;

import com.gifgroen.ticketmaster.model.Search;
import com.gifgroen.ticketmaster.model.base.Result;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Service definition for the Discovery API.
 */
public interface Discovery {
    @GET("discovery/v2/events.json")
    Observable<Result<Search>> getEvents(@Query("apikey") String apiKey);
}
