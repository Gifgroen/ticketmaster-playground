package com.gifgroen.ticketmaster.dependency.module;


import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
    @Provides
    @Named("BaseLink")
    String providesBaseLink() {
        return "https://app.ticketmaster.com/";
    }

    @Provides
    @Named("ApiKey")
    String providesApiKey() {
        return "";
    }

    @Provides
    OkHttpClient providesHttpClient(Interceptor interceptor) {
        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    @Provides
    RxJava2CallAdapterFactory providesRxCallFactory() {
        return RxJava2CallAdapterFactory.create();
    }

    @Provides
    GsonConverterFactory providesGsonFactory() {
        return GsonConverterFactory.create();
    }

    @Provides
    Interceptor providesApiInterceptor(@Named("ApiKey") String key) {
        return chain -> {
            Request original = chain.request();
            HttpUrl originalHttpUrl = original.url();

            HttpUrl url = originalHttpUrl.newBuilder()
                    .addQueryParameter("apikey", key)
                    .build();

            Request.Builder requestBuilder = original.newBuilder().url(url);
            Request request = requestBuilder.build();
            return chain.proceed(request);
        };
    }
}
