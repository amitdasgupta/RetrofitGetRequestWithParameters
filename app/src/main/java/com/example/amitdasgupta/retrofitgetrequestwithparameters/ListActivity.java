package com.example.amitdasgupta.retrofitgetrequestwithparameters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ApiInterface apiInterface;
    List<Calories> caloriesList;
    RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        if(getIntent().getExtras()!=null)
        {
            String type=getIntent().getExtras().getString("type");
            fetchInfo(type);

        }
    }
    public void fetchInfo(String type)
    {
        apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Calories>> call=apiInterface.getCaloriInfo(type);
        call.enqueue(new Callback<List<Calories>>() {
            @Override
            public void onResponse(Call<List<Calories>> call, Response<List<Calories>> response) {
                caloriesList=response.body();
                adapter=new RecyclerAdapter(caloriesList,ListActivity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Calories>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failure",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
