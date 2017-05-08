package com.gifgroen.ticketmaster.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Service generator which generates interface(s) to the Ticketmaster developer API based using
 * Retrofit, RxJava 2 and GSON.
 */
public class Api {
    /* Key used to access Ticketmaster's public API(s). */
    public static final String KEY = "";

    /* URL to Ticketmaster's developer API(s). */
    private static final String BASE_LINK = "https://app.ticketmaster.com/";

    /* Http client which manage network request(s)/response(s). */
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    /* Service factory with Rx2 and GSON setup. */
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_LINK)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create());

    /**
     *
     * @param serviceClass the interface to which we create an API.
     * @param <S> Type of the API service definition
     * @return Api service with interface defined in serviceClass.
     */
    public static <S> S createService(Class<S> serviceClass) {
        builder.client(httpClient.build());
        Retrofit retrofit = builder.build();
        return retrofit.create(serviceClass);
    }
}
