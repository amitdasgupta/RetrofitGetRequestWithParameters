package com.example.amitdasgupta.retrofitgetrequestwithparameters;

import com.google.gson.annotations.SerializedName;

/**
 * Created by AMIT DAS GUPTA on 25-09-2017.
 */

public class Calories {
    @SerializedName("Id")
    int id;
    @SerializedName("Name")
    String name;
    @SerializedName("Image")
    String image;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Calories(int id, String name, String image) {
        this.id = id;

        this.name = name;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
