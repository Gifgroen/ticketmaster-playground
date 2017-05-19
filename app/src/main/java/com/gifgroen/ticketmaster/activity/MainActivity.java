package com.gifgroen.ticketmaster.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gifgroen.ticketmaster.R;
import com.gifgroen.ticketmaster.dependency.DaggerApiComponent;
import com.gifgroen.ticketmaster.dependency.DaggerNetworkComponent;
import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.model.embedded.EventSearch;
import com.gifgroen.ticketmaster.network.interfaces.Discovery;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
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

        service.getEvents()
                .subscribeOn(Schedulers.io())
                .map(Result::getEmbedded)
                .map(EventSearch::getEvents)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    event -> Log.e(TAG, String.valueOf(event)),
                    err -> Log.e(TAG, "Oh noes!", err)
                );

    }
}
