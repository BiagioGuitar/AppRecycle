package com.example.biagi.apprecycle;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalHolder extends RecyclerView.ViewHolder {

    TextView nomeAnimle ;
    ImageView imgAnimale;
    Animale animal;

    public AnimalHolder(@NonNull View itemView) {
        super(itemView);

        nomeAnimle = itemView.findViewById(R.id.nomeAnimale);
        imgAnimale= itemView.findViewById(R.id.imgAnimale);
    }

    public void bind(Animale an){
        nomeAnimle.setText(an.getAnimale());
    }



}
