package com.gifgroen.ticketmaster.dependency;

import android.content.Context;
import android.support.annotation.NonNull;

import com.gifgroen.ticketmaster.dependency.component.ApiComponent;
import com.gifgroen.ticketmaster.dependency.component.AppComponent;
import com.gifgroen.ticketmaster.dependency.component.DaggerApiComponent;
import com.gifgroen.ticketmaster.dependency.component.DaggerAppComponent;
import com.gifgroen.ticketmaster.dependency.component.DaggerNetworkComponent;
import com.gifgroen.ticketmaster.dependency.module.DatabaseModule;

/**
 * Created by karsten on 30/05/2017.
 */

public class ComponentRepository {
    private static ApiComponent sApiComponent;
    private static AppComponent sAppComponent;

    public static AppComponent getAppComponent(Context context) {
        if (sAppComponent == null) {
            sAppComponent = DaggerAppComponent.builder()
                    .apiComponent(getApiComponent())
                    .databaseModule(new DatabaseModule(context))
                    .build();
        }
        return sAppComponent;
    }

    @NonNull
    private static ApiComponent getApiComponent() {
        if(sApiComponent == null) {
            sApiComponent = DaggerApiComponent.builder().networkComponent(DaggerNetworkComponent.create()).build();
        }
        return sApiComponent;
    }

}
