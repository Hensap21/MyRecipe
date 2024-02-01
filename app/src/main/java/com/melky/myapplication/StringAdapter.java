package com.melky.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.ViewHolder> {
    private ArrayList<String> strings;
    private Context context;
    private int colorRes = -1;

    public StringAdapter(ArrayList<String> strings) {
        this.strings = strings;
    }

    public StringAdapter(ArrayList<String> strings, Context context, int colorRes) {
        this.strings = strings;
        this.context = context;
        this.colorRes = colorRes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_string, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String s = strings.get(position);
        holder.header.setText(String.valueOf(position + 1));
        holder.text.setText(s);
        if (colorRes != -1) {
            holder.cardHeader.setCardBackgroundColor(ContextCompat.getColor(context, colorRes));
        }
    }

    @Override
    public int getItemCount() {
        return strings == null ? 0 : strings.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardHeader;
        TextView header, text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardHeader = itemView.findViewById(R.id.cardView_cardStringHeader);
            header = itemView.findViewById(R.id.textView_textStringHeader);
            text = itemView.findViewById(R.id.textView_textString);
        }
    }
}