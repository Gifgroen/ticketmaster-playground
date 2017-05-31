package com.gifgroen.ticketmaster.activity;

import android.arch.lifecycle.LifecycleActivity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.util.Log;

import com.gifgroen.ticketmaster.R;
import com.gifgroen.ticketmaster.dependency.ComponentRepository;
import com.gifgroen.ticketmaster.repos.EventRepository;

import javax.inject.Inject;

import io.reactivex.schedulers.Schedulers;

public class MainActivity extends LifecycleActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    EventRepository mRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ComponentRepository.getAppComponent(getApplicationContext()).inject(this);

        mRepository.searchEvents("slayer")
                .flatMapIterable(e -> e)
                .map(e -> e.name + " -> " + e.location)
                .subscribeOn(Schedulers.io())
                .subscribe(string -> Log.e(TAG, string));
    }
}
