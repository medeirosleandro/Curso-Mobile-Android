package com.example.aula_01.recyclefatima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FatimaAdapter fatimaAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        MinasProgramacao adalove = new MinasProgramacao("Ada", "Ada Lovelace", "@drawable/adalovelace");
        MinasProgramacao carol = new MinasProgramacao("Carol", "Carol Shaw", "@drawable/carolshaw");
        MinasProgramacao france = new MinasProgramacao("France", "France Sallen", "@drawable/francesallen");
        MinasProgramacao garotas = new MinasProgramacao("Garotas", "Garotas do Eniac", "@drawable/garotasdoenic");
        MinasProgramacao grace = new MinasProgramacao("Grace", "Grace Hopper", "@drawable/gracehopper");
        MinasProgramacao irma = new MinasProgramacao("Irma", "Irma Mary", "@drawable/irmamary");
        MinasProgramacao jean = new MinasProgramacao("Jean", "Jean Sammet", "@drawable/jeansammet");
        MinasProgramacao karen = new MinasProgramacao("Karen", "Karen Spark", "@drawable/karenspark");
        MinasProgramacao radia = new MinasProgramacao("Radia", "Radia Perlman", "@drawable/radiaperlman");
        MinasProgramacao roberta = new MinasProgramacao("Roberta", "Roberta Willians", "@drawable/robertawillians");

        List<MinasProgramacao> lista = new ArrayList<>();
        lista.add(adalove);
        lista.add(carol);
        lista.add(france);
        lista.add(garotas);
        lista.add(grace);
        lista.add(irma);
        lista.add(jean);
        lista.add(karen);
        lista.add(radia);
        lista.add(roberta);
        fatimaAdapter = new FatimaAdapter(lista, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fatimaAdapter);

    }
}
