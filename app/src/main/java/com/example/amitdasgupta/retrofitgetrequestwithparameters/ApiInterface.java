package com.example.amitdasgupta.retrofitgetrequestwithparameters;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by AMIT DAS GUPTA on 26-09-2017.
 */

public interface ApiInterface {
    @GET("readfruits.php")
    Call<List<Calories>> getCaloriInfo(@Query("item_type") String item_type);
}
