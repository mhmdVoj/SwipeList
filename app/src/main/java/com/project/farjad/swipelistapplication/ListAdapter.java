package com.project.farjad.swipelistapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    List<Item> ItemList;


    public ListAdapter(List<Item> itemList) {
        ItemList = itemList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.BindItem(ItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return ItemList.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView date;
        private ImageView imageView;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewName);
            date = itemView.findViewById(R.id.textViewDate);
            imageView = itemView.findViewById(R.id.imageView);
        }
        public void BindItem(Item item){
            name.setText(item.getName());
            date.setText(item.getDate());
            imageView.setImageResource(item.getImg());
        }
    }
}
