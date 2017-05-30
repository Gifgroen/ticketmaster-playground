package com.gifgroen.ticketmaster.dependency.component;

import com.gifgroen.ticketmaster.activity.MainActivity;
import com.gifgroen.ticketmaster.dependency.module.DatabaseModule;

import dagger.Component;

@Component(dependencies = ApiComponent.class, modules = DatabaseModule.class)
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
