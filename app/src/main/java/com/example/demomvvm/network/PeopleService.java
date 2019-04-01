package com.example.demomvvm.network;

import rx.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PeopleService {
    @GET("/")
    Observable<PeopleResponse> fetchPeople(@Query("results") int numberResult, @Query("nat") String position);
}
