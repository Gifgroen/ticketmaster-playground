package com.gifgroen.ticketmaster.network;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Service generator which generates interface(s) to the Ticketmaster developer API based using
 * Retrofit, RxJava 2 and GSON.
 */
public class ApiGenerator {

    private Retrofit retrofit;

    @Inject
    public ApiGenerator(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    /**
     *
     * @param serviceClass the interface to which we create an API.
     * @param <S> Type of the API service definition
     * @return ApiGenerator service with interface defined in serviceClass.
     */
    public <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
