package com.example.inggris.API;

import com.example.inggris.model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SelectAPI {
    @GET ("SelectpengurusTPA.php")
    Call<List<UserModel>> SelectpengurusTPA();
}
