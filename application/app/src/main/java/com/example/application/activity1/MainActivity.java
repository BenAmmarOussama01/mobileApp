package com.example.application.activity1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.application.R;
import com.example.application.activity1.Recette;
import com.example.application.activity1.RecetteAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    RecyclerView list;
    /*list de recette*/
    ArrayList<Recette> list_Recette= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.recycler);
        /*appeler de layout manager pour etre vertical*/
        list.setLayoutManager(new LinearLayoutManager(this));
        /*appel remplir*/
        remplir();
        /*appel de l'adaptateur*/
        RecetteAdapter adapter=new RecetteAdapter(this,list_Recette);
        /*applique de l'adapter*/
        list.setAdapter(adapter);

        /*enabled adapter*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    /*inserer des Recette   au nv de list contact*/
    public void remplir(){
        list_Recette.add(new Recette("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work The lemon adds an almost sweet taste. Be generous with it!"));
        list_Recette.add(new Recette("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salso. It really is our all-time favorite summer salad"));
        list_Recette.add(new Recette("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good Essy and I ate it ALL the first time I made it If someone is hesitant about plant- based food, this has to be a co à convincer"));
        list_Recette.add(new Recette("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more or less lime according to taste"));
        list_Recette.add(new Recette("Broiled Tilapia Parmesan","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and"));
        list_Recette.add(new Recette("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work The lemon adds an almost sweet taste. Be generous with it!"));
        list_Recette.add(new Recette("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salso. It really is our all-time favorite summer salad"));
        list_Recette.add(new Recette("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good Essy and I ate it ALL the first time I made it If someone is hesitant about plant- based food, this has to be a co à convincer"));
        list_Recette.add(new Recette("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more or less lime according to taste"));
        list_Recette.add(new Recette("Broiled Tilapia Parmesan","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and"));
        list_Recette.add(new Recette("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work The lemon adds an almost sweet taste. Be generous with it!"));
        list_Recette.add(new Recette("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salso. It really is our all-time favorite summer salad"));
        list_Recette.add(new Recette("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good Essy and I ate it ALL the first time I made it If someone is hesitant about plant- based food, this has to be a co à convincer"));
        list_Recette.add(new Recette("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more or less lime according to taste"));
        list_Recette.add(new Recette("Broiled Tilapia Parmesan","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and"));
        list_Recette.add(new Recette("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work The lemon adds an almost sweet taste. Be generous with it!"));
        list_Recette.add(new Recette("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salso. It really is our all-time favorite summer salad"));
        list_Recette.add(new Recette("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good Essy and I ate it ALL the first time I made it If someone is hesitant about plant- based food, this has to be a co à convincer"));
        list_Recette.add(new Recette("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more or less lime according to taste"));
        list_Recette.add(new Recette("Broiled Tilapia Parmesan","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and"));
        list_Recette.add(new Recette("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work The lemon adds an almost sweet taste. Be generous with it!"));
        list_Recette.add(new Recette("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salso. It really is our all-time favorite summer salad"));
        list_Recette.add(new Recette("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good Essy and I ate it ALL the first time I made it If someone is hesitant about plant- based food, this has to be a co à convincer"));
        list_Recette.add(new Recette("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more or less lime according to taste"));
        list_Recette.add(new Recette("Broiled Tilapia Parmesan","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and"));
        list_Recette.add(new Recette("Kale/Lemon Sandwiches","This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work The lemon adds an almost sweet taste. Be generous with it!"));
        list_Recette.add(new Recette("Mango-Lime Bean Salad","Everyone loves this, so double or even triple the recipe! It vanishes in a flash, and also works well as a salso. It really is our all-time favorite summer salad"));
        list_Recette.add(new Recette("Sweet Potato and Lentil Soup with Shiitake Mushrooms","This soup is so good Essy and I ate it ALL the first time I made it If someone is hesitant about plant- based food, this has to be a co à convincer"));
        list_Recette.add(new Recette("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. It is fast to make at the last minute. Use more or less lime according to taste"));
        list_Recette.add(new Recette("Broiled Tilapia Parmesan","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and"));


    }

    }
