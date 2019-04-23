package com.example.anew;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetHolder> {
    private Context context;
    private ArrayList<Planet> planets;

    public PlanetAdapter(Context context, ArrayList<Planet> planets) {
        this.context = context;
        this.planets = planets;
    }

    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row,
                viewGroup, false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetHolder planetHolder, int i) {
        Planet planet = planets.get(i);
        planetHolder.setDetails(planet);
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }
}
