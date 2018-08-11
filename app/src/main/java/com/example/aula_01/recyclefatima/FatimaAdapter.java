package com.example.aula_01.recyclefatima;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

import java.util.List;

public class FatimaAdapter extends RecyclerView.Adapter<FatimaAdapter.ViewHolder> {

    List<MinasProgramacao> list;
    Context context;

    public FatimaAdapter(List<MinasProgramacao> list, Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FatimaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflate.inflate(R.layout.layout_cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FatimaAdapter.ViewHolder holder, int position) {
        MinasProgramacao minasProgramacao = list.get(position);
        holder.bind(minasProgramacao.getConteudo(), minasProgramacao.getImagem());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        ImageView imagem;
        Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            this.nome = itemView.findViewById(R.id.textodaimagem);
            this.imagem = itemView.findViewById(R.id.imagem);
        }

        public int getImageDrawableResId(String imageId ){
            Resources resources = context.getResources();
            return resources.getIdentifier(imageId, "drawable", context.getPackageName());
        }

        public void bind(String nome, String imagem){
            this.nome.setText(nome);
            this.imagem.setImageResource(getImageDrawableResId(imagem));
        }


    }
}
