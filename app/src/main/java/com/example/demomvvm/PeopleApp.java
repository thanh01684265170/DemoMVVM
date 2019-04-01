package com.example.demomvvm;

import android.app.Application;
import android.content.Context;

import com.example.demomvvm.network.PeopleAPI;
import com.example.demomvvm.network.PeopleService;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by le.quang.hoa on 12/5/16.
 */

public class PeopleApp extends Application {

    private PeopleService mPeopleService;
    private Scheduler mScheduler;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static PeopleApp get(Context context) {
        return (PeopleApp) context.getApplicationContext();
    }

    public static PeopleApp create(Context context) {
        return PeopleApp.get(context);
    }

    public PeopleService getPeopleService() {
        if (mPeopleService == null) mPeopleService = PeopleAPI.getAPI();
        return mPeopleService;

    }

    public void setPeopleService(PeopleService peopleService) {
        mPeopleService = peopleService;
    }

    public Scheduler subscribleScheduler() {
        if (mScheduler == null) mScheduler = Schedulers.io();
        return mScheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        mScheduler = scheduler;
    }
}
