package com.example.biagi.apprecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Animale> listAnimale = new ArrayList<>();
    RecyclerView recyclerView;
    AnimalAdapter ad = new AnimalAdapter(listAnimale);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animale cane = new Animale("cane");
        Animale gatto = new Animale("gatto");
        listAnimale.add(cane);
        listAnimale.add(gatto);

     //  EditText editTxt= findViewById(R.id.editText);
       // AnimalAdapter ad = new AnimalAdapter(listAnimale);


        recyclerView=findViewById(R.id.Rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(ad);

        Button addBotton = findViewById(R.id.addButton);

        addBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTxt= findViewById(R.id.editText);
                String inputTxt= editTxt.getText().toString();
                if(inputTxt.equalsIgnoreCase("cane")) {
                    Animale cane = new Animale("Cane");
                    listAnimale.add(cane);
                }else if (inputTxt.equalsIgnoreCase("gatto")){
                    Animale gatto = new Animale("Gatto");
                    listAnimale.add(gatto);
                }else if (inputTxt.equalsIgnoreCase("topo")){
                    Animale topo = new Animale("topo");
                    listAnimale.add(topo);
                }else{
                    Toast.makeText(MainActivity.this,"Animale non prsente",Toast.LENGTH_LONG).show();


                }
                ad.notifyDataSetChanged();
            }
        });


    }
}
