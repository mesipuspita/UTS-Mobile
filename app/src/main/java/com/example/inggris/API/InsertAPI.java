package com.example.inggris.API;

import com.example.inggris.model.UserModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InsertAPI {
    @FormUrlEncoded
    @POST("insertpengurusTPA.php")
    Call<UserModel> insertUser(
            @Field("idsantri") int idsantri,
            @Field("namasantri")String namasantri,
            @Field("tingkatan") String tingkatan,
            @Field("hafalansurat") String hafalansurat,
            @Field("bacaanalquran") String bacaanalquran,
            @Field("hafalansholat") String hafalansholat,
            @Field("tanggal") String tanggal
    );
}
