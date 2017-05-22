package com.gifgroen.ticketmaster.activity;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;

import com.gifgroen.ticketmaster.R;
import com.gifgroen.ticketmaster.db.EventSearchDatabase;
import com.gifgroen.ticketmaster.dependency.DaggerApiComponent;
import com.gifgroen.ticketmaster.dependency.DaggerNetworkComponent;
import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.model.data.Event;
import com.gifgroen.ticketmaster.model.embedded.EventSearch;
import com.gifgroen.ticketmaster.network.interfaces.Discovery;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends LifecycleActivity {
    static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Discovery service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_main);

        DaggerApiComponent.builder()
                .networkComponent(DaggerNetworkComponent.create())
                .build()
                .inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Context c = getApplicationContext();
        EventSearchDatabase db = Room.databaseBuilder(c, EventSearchDatabase.class, "event-search").build();

        LiveData<List<Event>> eventData = db.eventSearchDao().loadAll();
        eventData.observe(this, events -> {
            Log.e(TAG, "Got event changes from DB: " + events.size());
        });

        service.getEvents()
                .map(Result::getEmbedded)
                .map(EventSearch::getEvents)
                .flatMapIterable(event -> event)
                .doOnNext(event -> db.eventSearchDao().save(event))
                .subscribeOn(Schedulers.io())
                .subscribe();

    }
}
