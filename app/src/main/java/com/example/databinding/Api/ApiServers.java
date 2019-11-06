package com.example.databinding.Api;

import com.example.databinding.modeldata.User;

import retrofit2.Call;

import retrofit2.http.GET;

public interface ApiServers {
    @GET("test.json")
    Call<User> getDataUser();
}
