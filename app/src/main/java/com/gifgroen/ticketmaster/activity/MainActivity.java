package com.gifgroen.ticketmaster.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gifgroen.ticketmaster.R;
import com.gifgroen.ticketmaster.model.base.Result;
import com.gifgroen.ticketmaster.network.Api;
import com.gifgroen.ticketmaster.network.interfaces.Discovery;

import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        /* Stub test for Reactive API. */
        Discovery service = Api.createService(Discovery.class);

        service.getEvents()
                .subscribeOn(Schedulers.io())
                .map(Result::getEmbedded)
                .map(search -> search.getEvents().get(0))
                .map(Result::getEmbedded)
                .map(loc -> loc.getAttractions().get(0))
                .subscribe(attraction -> Log.e(TAG, String.valueOf(attraction)));

    }
}
