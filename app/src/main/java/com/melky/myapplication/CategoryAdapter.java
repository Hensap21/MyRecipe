package com.melky.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private ArrayList<Category> categories;
    private Context context;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category category = categories.get(position);
        Picasso.get().load(category.getImageRes()).into(holder.categoryImage);
        holder.categoryName.setText(category.getName());

        holder.categoryItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailCategoryActivity.class);
                intent.putExtra(DetailCategoryActivity.ID, category.getId());
                intent.putExtra(DetailCategoryActivity.NAME, category.getName());
                intent.putExtra(DetailCategoryActivity.IMAGE, category.getImageRes());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories == null ? 0 : categories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CardView categoryItem;
        ImageView categoryImage;
        TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryItem = itemView.findViewById(R.id.cardView_categoryItem);
            categoryImage = itemView.findViewById(R.id.imageView_categoryImage);
            categoryName = itemView.findViewById(R.id.textView_categoryName);
        }
    }
}