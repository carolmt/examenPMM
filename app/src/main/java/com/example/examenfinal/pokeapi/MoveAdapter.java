package com.example.examenfinal.pokeapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examenfinal.R;
import com.example.examenfinal.models.Move;
import com.example.examenfinal.models.MoveListItem;

import java.util.List;

public class MoveAdapter extends RecyclerView.Adapter<MoveAdapter.ViewHolder> {

    private List<MoveListItem> datosMove;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombreTextView;

        public ViewHolder(View view) {
            super(view);

            nombreTextView = (TextView) view.findViewById(R.id.name);

            nombreTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nombre = nombreTextView.getText().toString();
                    Toast.makeText(itemView.getContext(), nombre + " se ha añadido a favoritos.", Toast.LENGTH_SHORT).show();
                }
            });
        }

        public TextView getNombreTextView() {
            return nombreTextView;
        }
    }

        public MoveAdapter(List<MoveListItem> datosMove) {
            this.datosMove = datosMove;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.viewholder_move_list, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final  int position) {

        viewHolder.getNombreTextView().setText(datosMove.get(position).getName());

        MoveListItem item = datosMove.get(position);
        viewHolder.nombreTextView.setText(item.getName());

    }


    @Override
    public int getItemCount() {
        return datosMove.size();
    }

}
