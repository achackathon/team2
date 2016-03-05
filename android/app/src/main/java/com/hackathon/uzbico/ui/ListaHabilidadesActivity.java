package com.hackathon.uzbico.ui;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

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
        messageList.add(new HabilidadeUsuario(1, "Bombeiro", "Bombeiro: habil em encanamentos..."));
        messageList.add(new HabilidadeUsuario(2, "Costura", "Costureira com capacidade de overlock"));
        messageList.add(new HabilidadeUsuario(3, "Chaveiro", "Licenca pra chaveiro, conserto e abertura de portas"));
        messageList.add(new HabilidadeUsuario(4, "Cuidador de idosos", "Cuidados com os mais experientes"));
        messageList.add(new HabilidadeUsuario(5, "Babysitter", "Cuidar de crianças, inclusive alimentação"));
        messageList.add(new HabilidadeUsuario(6, "Dogwalker", "Caminhar com cães quando o dono nao pode"));
        messageList.add(new HabilidadeUsuario(7, "Organizador de micro eventos", "Arranjo seu churrasco, happy hour..."));
        messageList.add(new HabilidadeUsuario(8, "Sabadão é dia de...", "Kd minha API REST, MauMau??"));
        messageList.add(new HabilidadeUsuario(9, "Programar!!", "Kd minha API REST, MauMau??"));
        messageList.add(new HabilidadeUsuario(10, "Bora lá!!!", "Kd minha API REST, MauMau??"));
        messageList.add(new HabilidadeUsuario(11, "Tá quaaaaseeee!!", "Kd minha API REST, MauMau??"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_habilidades_usuario, menu);
        final MenuItem searchItem = menu.findItem(R.id.menu_search);
        if (searchItem != null) {
            SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            final SearchView view = (SearchView) searchItem.getActionView();
            if (view == null) {
                //  LOGW(TAG, "Could not set up search view, view is null.");
            } else {
                view.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
                view.setIconified(true);
                view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String s) {
                        //view.clearFocus();

                        return true;
                    }

                    @Override
                    public boolean onQueryTextChange(final String s) {
                        if (s.length() > 2) {
                            Toast.makeText(ListaHabilidadesActivity.this, "MauMau, kd minha API REST??", Toast.LENGTH_SHORT).show();
                            //     DataBusiness.getTagsFilterOptionsAsync(getApplicationContext(), s, getTagsFilterOptionsCallbacks);

                            messageList.clear();
                            messageList.add(new HabilidadeUsuario(1, "Ei, MauMau...", "Ei, MauMau..."));
                            messageList.add(new HabilidadeUsuario(2, "Kd minha API REST, MauMau??", "Kd minha API REST, MauMau??"));

                            mAdapter = new ListaHabilidadesAdapter(getBaseContext(), messageList);
                            mRecyclerView.setAdapter(mAdapter);
                            mRecyclerView.setItemAnimator(new DefaultItemAnimator());

                        }
                        return true;
                    }
                });
                view.setOnCloseListener(new SearchView.OnCloseListener() {
                    @Override
                    public boolean onClose() {
                        return false;
                    }
                });
            }
        }
        return true;
    }
}


