package com.melky.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> implements Filterable {

    private List<Recipe> recipes;
    private List<Recipe> recipesFiltered;
    private Context context;

    public RecipeAdapter(List<Recipe> recipes, Context context) {
        this.recipes = recipes;
        this.context = context;
        this.recipesFiltered = recipes;
    }

    @NonNull
    @Override
    public RecipeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recipe,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.ViewHolder holder, int position) {

        Recipe recipe = recipesFiltered.get(position);

        Picasso.get().load(recipe.getImageRes()).placeholder(R.drawable.kitchen).into(holder.recipeImage);
        holder.recipeName.setText(recipe.getName());

        holder.recipeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailRecipeActivity.class);
                intent.putExtra(DetailRecipeActivity.NAME, recipe.getName());
                intent.putExtra(DetailRecipeActivity.IMAGE, recipe.getImageRes());
                intent.putStringArrayListExtra(DetailRecipeActivity.INGREDIENTS, recipe.getIngredient());
                intent.putStringArrayListExtra(DetailRecipeActivity.STEPS, recipe.getSteps());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return recipesFiltered == null ? 0 : recipesFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    recipesFiltered = recipes;
                } else {
                    List<Recipe> filteredList = new ArrayList<>();
                    for (Recipe row : recipes) {

                        if (row.getName().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    recipesFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = recipesFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                recipesFiltered = (ArrayList<Recipe>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView recipeItem;
        ImageView recipeImage;
        TextView recipeName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeItem = itemView.findViewById(R.id.cardView_recipeItem);
            recipeImage = itemView.findViewById(R.id.imageView_recipeImage);
            recipeName = itemView.findViewById(R.id.textView_recipeName);
        }

    }
}