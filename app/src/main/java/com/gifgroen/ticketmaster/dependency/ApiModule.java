package com.gifgroen.ticketmaster.dependency;

import com.gifgroen.ticketmaster.network.ApiGenerator;
import com.gifgroen.ticketmaster.network.interfaces.Discovery;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by karsten on 17/05/2017.
 */
@Module
public class ApiModule {

    @Provides
    Discovery providesDiscovery(ApiGenerator generator) {
        return generator.createService(Discovery.class);
    }

    @Provides
    Retrofit providesRetrofit(@Named("BaseLink") String baseLink, OkHttpClient client, RxJava2CallAdapterFactory rxFactory, GsonConverterFactory gsonFactory) {
        return new Retrofit.Builder()
                .baseUrl(baseLink)
                .client(client)
                .addCallAdapterFactory(rxFactory)
                .addConverterFactory(gsonFactory)
                .build();
    }
}
