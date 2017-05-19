package com.gifgroen.ticketmaster.dependency;

import javax.inject.Named;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by karsten on 16/05/2017.
 */
@Component(modules = NetworkModule.class)
public interface NetworkComponent {
    @Named("BaseLink") String baseLink();
    OkHttpClient client();
    RxJava2CallAdapterFactory providesRxCallFactory();
    GsonConverterFactory providesGsonFactory();
}
