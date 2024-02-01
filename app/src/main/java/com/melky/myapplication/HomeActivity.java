package com.melky.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ViewPager bannerViewPager;
    private RecyclerView categoryRecyclerView;
    private SearchView searchView;
    private TextView menuHome, menuProfile, btnKeluar;
    private DataBaseHelperLogin db;
    public static final String SHARED_PREF_NAME = "myPref";

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menuHome = findViewById(R.id.menuHome);
        menuProfile = findViewById(R.id.menuProfile);

        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Home Clicked");
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        menuProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Profile Clicked");
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        btnKeluar = findViewById(R.id.menuLogout);
        db = new DataBaseHelperLogin(this);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        Boolean checksession = db.checkSession("ada");
        if (checksession == false){
            Intent login = new Intent(getApplicationContext(), Login.class);
            startActivity(login);
            finish();
        }
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean updateSession = db.upgradeSession("kosong", 1);
                if(updateSession == true){
                    Toast.makeText(getApplicationContext(), "Berhasil Keluar", Toast.LENGTH_SHORT).show();

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("masuk", false);
                    editor.apply();

                    Intent keluar = new Intent(getApplicationContext(), Login.class);
                    startActivity(keluar);
                    finish();
                }

            }
        });

        bannerViewPager = findViewById(R.id.viewPager_banner);
        categoryRecyclerView = findViewById(R.id.recyclerView_categories);
        searchView = findViewById(R.id.searchView_home);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                intent.putExtra(SearchActivity.QUERY, s);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        setBanner();
        setCategories();


    }

    public void setBanner() {
        ArrayList<Recipe> recipes = DataProvider.getFavoriteRecipes();
        BannerAdapter bannerAdapter = new BannerAdapter(recipes, this);
        bannerViewPager.setAdapter(bannerAdapter);
        bannerViewPager.setPadding(20, 0, 150, 0);
        bannerAdapter.notifyDataSetChanged();
    }

    private void setCategories() {
        ArrayList<Category> categories = DataProvider.getCategories();
        CategoryAdapter categoryAdapter = new CategoryAdapter(categories, this);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        categoryRecyclerView.setNestedScrollingEnabled(true);
        categoryAdapter.notifyDataSetChanged();
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}