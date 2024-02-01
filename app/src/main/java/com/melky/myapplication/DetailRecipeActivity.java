package com.melky.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailRecipeActivity extends AppCompatActivity {

    public static final String NAME = "name";
    public static final String IMAGE = "image";
    public static final String INGREDIENTS = "ingredients";
    public static final String STEPS = "steps";

    private StringAdapter ingredientAdapter;
    private StringAdapter stepAdapter;

    private String name;
    private int imageRes;
    private ArrayList<String> ingredient = null;
    private ArrayList<String> steps = null;

    private Toolbar toolbar;
    private ImageView recipeImage;
    private TextView recipeName;
    private RecyclerView ingredientRv;
    private RecyclerView stepRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);

        name = getIntent().getStringExtra(NAME);
        imageRes = getIntent().getIntExtra(IMAGE, -1);
        ingredient = getIntent().getStringArrayListExtra(INGREDIENTS);
        steps = getIntent().getStringArrayListExtra(STEPS);

        toolbar = findViewById(R.id.toolbar_recipeDetail);
        recipeImage = findViewById(R.id.imageView_recipeImage);
        recipeName = findViewById(R.id.textView_recipeName);
        ingredientRv = findViewById(R.id.recyclerView_ingredients);
        stepRv = findViewById(R.id.recyclerView_steps);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(" ");

        Picasso.get().load(imageRes).into(recipeImage);
        recipeName.setText(name);


        setIngredients();
        setSteps();
    }

    private void setIngredients() {
        ingredientAdapter = new StringAdapter(ingredient, this, R.color.accent);
        ingredientRv.setLayoutManager(new LinearLayoutManager(this));
        ingredientRv.setAdapter(ingredientAdapter);
    }

    private void setSteps() {
        stepAdapter = new StringAdapter(steps);
        stepRv.setLayoutManager(new LinearLayoutManager(this));
        stepRv.setAdapter(stepAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
