package com.hackathon.uzbico.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hackathon.uzbico.R;
import com.hackathon.uzbico.model.HabilidadeUsuario;

import java.util.List;

/**
 * Adaptador da lista de itens exibidas na pesquisa de Habilidades.
 */
public class ListaHabilidadesAdapter extends RecyclerView.Adapter<ListaHabilidadesAdapter.ViewHolder> {

    private List<HabilidadeUsuario> habilidadesList;
    private Context context;

    public ListaHabilidadesAdapter(Context context, List<HabilidadeUsuario> messages) {
        this.habilidadesList = messages;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView lhabilidades;
        public TextView lnome;
        public LinearLayout llavaliacao;

        public ViewHolder(LinearLayout v) {
            super(v);
            lhabilidades = (TextView) v.findViewById(R.id.lhabilidades);
            lnome = (TextView) v.findViewById(R.id.lnome);
            llavaliacao = (LinearLayout) v.findViewById(R.id.llavaliacao);
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
        holder.lhabilidades.setText(habilidadesList.get(position).getMessage());
        holder.lnome.setText(habilidadesList.get(position).getSenderName());

        holder.llavaliacao.removeAllViews();
        for(int index = 0; index < habilidadesList.get(position).getId(); index++){
            ImageView icon = new ImageView(context);
            icon.setImageResource(android.R.drawable.btn_star_big_on);
            icon.setAdjustViewBounds(true);
            icon.setScaleType(ImageView.ScaleType.FIT_XY);
            icon.setVisibility(View.VISIBLE);

            holder.llavaliacao.addView(icon);
        }

        holder.lhabilidades.setOnClickListener(new View.OnClickListener() {
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
        return 0;
    }

}