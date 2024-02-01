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
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.List;

public class BannerAdapter extends PagerAdapter {


    private List<Recipe> recipes;
    private Context context;

    public BannerAdapter(List<Recipe> recipes, Context context) {
        this.recipes = recipes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_banner,
                container,
                false
        );

        Recipe recipe = recipes.get(position);

        ImageView recipeImage = view.findViewById(R.id.imageView_recipeImage);
        TextView recipeName = view.findViewById(R.id.textView_recipeName);
        CardView cardItem = view.findViewById(R.id.cardView_bannerItem);


        Picasso.get().load(recipe.getImageRes()).into(recipeImage);

        recipeName.setText(recipe.getName());

        cardItem.setOnClickListener(new View.OnClickListener() {
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

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}