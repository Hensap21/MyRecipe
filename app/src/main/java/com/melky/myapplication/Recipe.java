package com.melky.myapplication;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int imageRes;
    private ArrayList<String> ingredient = null;
    private ArrayList<String> steps = null;

    public Recipe(String name, int imageRes, ArrayList<String> ingredient, ArrayList<String> steps) {
        this.name = name;
        this.imageRes = imageRes;
        this.ingredient = ingredient;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public ArrayList<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<String> ingredient) {
        this.ingredient = ingredient;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
}
