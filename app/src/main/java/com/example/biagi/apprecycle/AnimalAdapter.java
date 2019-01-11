package com.example.biagi.apprecycle;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {

    private ArrayList<Animale> lista;

    public AnimalAdapter(ArrayList<Animale> list){
        lista=list;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.animale,viewGroup,false);

        return new AnimalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder animalHolder, int i) {
        Animale an = lista.get(i);
        animalHolder.bind(an);

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
