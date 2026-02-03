package com.example.projekt;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Produkt> produkty;
private RecyclerView recyclerView;
private ZakupyAdapter zakupyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });
        produkty = new ArrayList<>();
        produkty.add(new Produkt("Ok",5.0));
        produkty.add(new Produkt("to",5));
        produkty.add(new Produkt("nie",5));
        produkty.add(new Produkt("jest",5));
        produkty.add(new Produkt("jakby",5));
        produkty.add(new Produkt("okay",5));
        produkty.add(new Produkt("czaisz",5));
        produkty.add(new Produkt("to",5));
        zakupyAdapter = new ZakupyAdapter(MainActivity.this,produkty);
        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setAdapter(zakupyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}