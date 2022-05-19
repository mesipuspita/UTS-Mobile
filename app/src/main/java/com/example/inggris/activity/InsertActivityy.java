package com.example.inggris.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.inggris.API.InsertAPI;
import com.example.inggris.R;
import com.example.inggris.model.UserModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InsertActivityy extends AppCompatActivity {
    EditText idsantri, namasanti, tingkatan, hafalansurat,bacaalquran, hafalansholat,tanggal;
    Button btninput;


    private static Retrofit retrofit = null;
    private String baseURL = "https://mobiletrp3a.000webhostapp.com/public_html/insertpengurusTPA.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_activityy);

        idsantri = findViewById(R.id.editidsantri);
        namasanti = findViewById(R.id.editnamasantri);
        tingkatan=findViewById(R.id.edittingkat);
        hafalansurat= findViewById(R.id.edithafalansurat);
        bacaalquran = findViewById(R.id.editBacaansholat);
        hafalansholat = findViewById(R.id.edithafalansholat);
        tanggal = findViewById(R.id.edittanggal);
        btninput = findViewById(R.id.btninput);

        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataUser();
                Intent intent = new Intent(InsertActivityy.this,MainActivity.class);
            startActivity(intent);
            }
        });
    }

    private void insertDataUser() {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        InsertAPI insertAPI = retrofit.create(InsertAPI.class);

        Call<UserModel> call = insertAPI.insertUser
                (Integer.parseInt(idsantri.getText().toString())
                        , namasanti.getText().toString()
                        ,tingkatan.getText().toString()
                        , hafalansurat.getText().toString()
                        , bacaalquran.getText().toString()
                        ,hafalansholat.getText().toString()
                        , tanggal.getText().toString());
        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                namasanti.setText("");
                tingkatan.setText("");
                hafalansurat.setText("");
                bacaalquran.setText("");
                hafalansholat.setText("");
                tanggal.setText("");
                Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}