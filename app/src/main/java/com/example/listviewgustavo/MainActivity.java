package com.example.listviewgustavo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarVista();
    }

    public void generarVista(){

        ArrayAdapter<Inmueble> adapter = new ListaInmubleAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casabosque,"El volcan",800000));
        lista.add(new Inmueble(R.drawable.casaflotante,"La unta",950000));
        lista.add(new Inmueble(R.drawable.otracasa,"Potrero de los funes",1000000));
    }
}
