package com.example.application.activity1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.R;
import com.example.application.activity2.MainActivity2;

import java.util.ArrayList;

public class RecetteAdapter extends RecyclerView.Adapter<RecetteAdapter.RecetteHolder> {
    /*cree two variable context ,list of contact*/
    Context context;
    ArrayList<Recette> list_recette;
    /*constructor*/

    public RecetteAdapter(Context context, ArrayList<Recette> list_recette) {
        this.context = context;
        this.list_recette = list_recette;
    }
    @NonNull
    @Override
    public RecetteAdapter.RecetteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*create view*/
        View v= LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return new RecetteHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull RecetteAdapter.RecetteHolder holder, int position) {
        // Récupérez l'élément de la liste correspondant à la position
        Recette cv=list_recette.get(position);
        /*appel de la methode affichage*/
        holder.affichage(cv);
        // Set click listener for the item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the second activity
                Intent intent = new Intent(context, MainActivity2.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list_recette.size();
    }

    public class RecetteHolder extends RecyclerView.ViewHolder {
        /*widget que j'ai cree dans le card item*/
        TextView nom,desc;
        public RecetteHolder(@NonNull View itemView) {
            super(itemView);
            /*id of widget*/
            nom=itemView.findViewById(R.id.nom);
            desc= itemView.findViewById(R.id.desc);
        }

        public void affichage(Recette c) {
            nom.setText(c.getNom());
            desc.setText(c.getDesc());

        }
    }
}
