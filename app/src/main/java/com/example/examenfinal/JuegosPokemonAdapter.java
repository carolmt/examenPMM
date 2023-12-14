package com.example.examenfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JuegosPokemonAdapter extends RecyclerView.Adapter<JuegosPokemonAdapter.ViewHolder> {

    private List<ItemJuegoPokemon> listaJuegos;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombreTextView;
        private final TextView categoriaTextView;
        private final TextView costeTextView;

        public ViewHolder(View view) {
            super(view);

            categoriaTextView = (TextView) view.findViewById(R.id.categoriaJuego);
            nombreTextView = (TextView) view.findViewById(R.id.nombreJuego);
            costeTextView = (TextView) view.findViewById(R.id.costeJuego);

        }


        public TextView getNombreTextView() {
            return nombreTextView;
        }

        public TextView getCategoriaTextView() {
            return categoriaTextView;
        }

        public TextView getCosteTextView() {
            return costeTextView;
        }
    }

    public JuegosPokemonAdapter(List<ItemJuegoPokemon> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.juego_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final  int position) {

        viewHolder.getNombreTextView().setText(listaJuegos.get(position).getNombre());
        viewHolder.getCategoriaTextView().setText(listaJuegos.get(position).getCategoria());
        viewHolder.getCosteTextView().setText(listaJuegos.get(position).getCoste());

        ItemJuegoPokemon item = listaJuegos.get(position);
        viewHolder.nombreTextView.setText(item.getNombre());
        viewHolder.costeTextView.setText(item.getCategoria());
        viewHolder.categoriaTextView.setText(item.getCoste());

    }


    @Override
    public int getItemCount() {
        return listaJuegos.size();
    }

}

