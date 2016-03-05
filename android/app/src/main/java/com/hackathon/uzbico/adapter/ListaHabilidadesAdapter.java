package com.hackathon.uzbico.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hackathon.uzbico.R;
import com.hackathon.uzbico.model.HabilidadeUsuario;

import java.util.List;

public class ListaHabilidadesAdapter extends RecyclerView.Adapter<ListaHabilidadesAdapter.ViewHolder> {

    private List<HabilidadeUsuario> habilidadesList;

    public static final int SENDER = 0;
    public static final int RECIPIENT = 1;

    public ListaHabilidadesAdapter(Context context, List<HabilidadeUsuario> messages) {
        habilidadesList = messages;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(LinearLayout v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.text);
        }
    }

    @Override
    public ListaHabilidadesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.habilidade_usuario, parent, false);
        ViewHolder vh = new ViewHolder((LinearLayout) v);
        return vh;
    }

    public void remove(int pos) {
        int position = pos;
        habilidadesList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, habilidadesList.size());

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView.setText(habilidadesList.get(position).getMessage());
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return habilidadesList.size();
    }

    @Override
    public int getItemViewType(int position) {
        HabilidadeUsuario message = habilidadesList.get(position);

        if (message.getSenderName().equals("Chryssa")) {
            return SENDER;
        } else {
            return RECIPIENT;
        }

    }

}