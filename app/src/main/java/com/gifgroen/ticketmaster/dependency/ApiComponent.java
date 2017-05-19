package com.gifgroen.ticketmaster.dependency;

import com.gifgroen.ticketmaster.activity.MainActivity;

import dagger.Component;

/**
 * Created by karsten on 17/05/2017.
 */
@Component(modules = ApiModule.class, dependencies = NetworkComponent.class)
public interface ApiComponent {
    void inject(MainActivity activity);
}
