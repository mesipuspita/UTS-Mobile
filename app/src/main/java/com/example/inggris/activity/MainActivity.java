package com.example.inggris.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.inggris.API.ServerAPI;
import com.example.inggris.R;
import com.example.inggris.adapter.UserAdapter;
import com.example.inggris.model.UserModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
private RecyclerView recbrg;
private FloatingActionButton btnFab;
    private static final String URL_BARANG =
            "https://mobiletrp3a.000webhostapp.com/public_html/SelectpengurusTPA.php";
private LinearLayoutManager llm;
private UserAdapter userAdapter;
private List<UserModel>userModels = new ArrayList<>();

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recbrg = (RecyclerView) findViewById(R.id.recyclermesi);
        btnFab = findViewById(R.id.input);
        btnFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InsertActivityy.class);
                startActivity(intent);
            }
        });
        llm=new LinearLayoutManager(this);
        // glm=new GridLayoutManager(this,2);//untukdua kolom
        recbrg.setLayoutManager(llm);

        userAdapter = new UserAdapter(this,userModels);
        showDataUser();
        recbrg.setAdapter(userAdapter);
    }
    private void showDataUser() {
        ServerAPI.getselectAPI().SelectpengurusTPA().enqueue(new Callback<List<UserModel>>() {

            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                if (response.isSuccessful() && response.body()!=null) {
                    userModels.addAll(response.body());
                    userAdapter.notifyDataSetChanged();
                    Log.d("MainActivity", "message: " + userModels.size());
                }

            }
            public void onFailure(Call<List<UserModel>> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}