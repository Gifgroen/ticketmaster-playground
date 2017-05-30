package com.gifgroen.ticketmaster.activity;

import android.arch.lifecycle.LifecycleActivity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.widget.TextView;

import com.gifgroen.ticketmaster.R;
import com.gifgroen.ticketmaster.dependency.ComponentRepository;
import com.gifgroen.ticketmaster.model.data.Event;
import com.gifgroen.ticketmaster.repos.EventRepository;

import javax.inject.Inject;

public class MainActivity extends LifecycleActivity {
    @Inject
    EventRepository mRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ComponentRepository.getAppComponent(getApplicationContext()).inject(this);

        mRepository.getEvents().observe(this, events -> {
            StringBuilder foo = new StringBuilder();
            assert events != null;
            for (Event event : events) {
                foo.append("Event: ").append(event.name).append("\n").append("----").append("\n");
            }
            ((TextView)dataBinding.getRoot().findViewById(R.id.label)).setText(foo.toString());
        });
    }
}
