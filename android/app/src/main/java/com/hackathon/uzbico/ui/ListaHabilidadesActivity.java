package com.hackathon.uzbico.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hackathon.uzbico.R;
import com.hackathon.uzbico.adapter.ListaHabilidadesAdapter;
import com.hackathon.uzbico.model.HabilidadeUsuario;

import java.util.ArrayList;
import java.util.List;

public class ListaHabilidadesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<HabilidadeUsuario> messageList = new ArrayList<HabilidadeUsuario>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.habilidades_usuario_activity);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ListaHabilidadesAdapter(getBaseContext(), messageList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        fillWithNonsenseText();
    }

    public void fillWithNonsenseText() {
        messageList.add(new HabilidadeUsuario(1,"Ei, MauMau...", "Ei, MauMau..."));
        messageList.add(new HabilidadeUsuario(2,"Kd minha API REST, MauMau??", "Kd minha API REST, MauMau??"));
    }
}


