package com.example.inggris.API;

import androidx.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServerAPI {
    private static final String base_URL = "https://mobiletrp3a.000webhostapp.com/";
    //private  final  String base_LOCAL = "10.0.2.2/serverlocal";//
    private static Retrofit retro = null;

    @NonNull
    public static SelectAPI getselectAPI() {
        if (retro == null) {
            retro = new Retrofit.Builder()
                    .baseUrl(base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro.create(SelectAPI.class);
    }

    ;
}
