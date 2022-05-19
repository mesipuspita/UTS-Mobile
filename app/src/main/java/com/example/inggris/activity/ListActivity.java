package com.example.inggris.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.inggris.R;
import com.example.inggris.adapter.UserAdapter;
import com.example.inggris.model.UserModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recbrg;
    private FloatingActionButton btnFab;
    private LinearLayoutManager llm;
    private UserAdapter userAdapter;
    private List<UserModel> userModels = new ArrayList<>();
    private String baseURL = "https://mobiletrp3a.000webhostapp.com/public_html/SelectpengurusTPA.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    }

    public void List(View view) {
        Intent intent = new Intent(ListActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void Entri(View view) {
        Intent intent = new Intent(ListActivity.this, InsertActivityy.class);
        startActivity(intent);
    }
}