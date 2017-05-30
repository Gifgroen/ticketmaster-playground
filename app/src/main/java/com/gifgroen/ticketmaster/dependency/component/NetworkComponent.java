package com.gifgroen.ticketmaster.dependency.component;

import com.gifgroen.ticketmaster.dependency.module.NetworkModule;
import com.gifgroen.ticketmaster.dependency.scope.UserScope;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Component(modules = NetworkModule.class)
public interface NetworkComponent {
    @Named("BaseLink") String baseLink();
    OkHttpClient client();
    RxJava2CallAdapterFactory providesRxCallFactory();
    GsonConverterFactory providesGsonFactory();
}
