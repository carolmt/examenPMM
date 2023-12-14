package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class JuegosPokemon extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos_pokemon);

        RecyclerView recyclerView = findViewById(R.id.recyclerJuegos);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemJuegoPokemon itemJuego1 = new ItemJuegoPokemon( "ultra-ball", "...", "100");
        ItemJuegoPokemon itemJuego2 = new ItemJuegoPokemon( "great-ball", "...", "100");
        ItemJuegoPokemon itemJuego3 = new ItemJuegoPokemon( "ultra-ball", "...", "100");



        List<ItemJuegoPokemon> datosAbout = new ArrayList<>();
        datosAbout.add(itemJuego1);
        datosAbout.add(itemJuego2);
        datosAbout.add(itemJuego3);

        JuegosPokemonAdapter adapter = new JuegosPokemonAdapter(datosAbout);
        recyclerView.setAdapter(adapter);
    }

    public void onItemClick(ItemJuegoPokemon itemHotel) {
        showToast(itemHotel.getNombre());
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}