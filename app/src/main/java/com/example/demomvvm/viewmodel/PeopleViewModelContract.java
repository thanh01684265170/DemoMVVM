package com.example.demomvvm.viewmodel;

import android.content.Context;

import com.example.demomvvm.model.People;

import java.util.List;

public interface PeopleViewModelContract {

    interface MainView {
        void loadData(List<People> peoples);

        Context getContext();
    }

    interface ViewModel {
        void destroy();
    }
}
