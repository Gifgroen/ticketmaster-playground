package com.gifgroen.ticketmaster.dependency.component;

import com.gifgroen.ticketmaster.dependency.module.ApiModule;
import com.gifgroen.ticketmaster.dependency.scope.UserScope;
import com.gifgroen.ticketmaster.network.interfaces.Discovery;

import dagger.Component;

@Component(modules = ApiModule.class, dependencies = NetworkComponent.class)
public interface ApiComponent {
    Discovery discovery();
}
