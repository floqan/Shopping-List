package com.example.shopping_list.ui.recipes;

import android.media.Image;

public class Recipe {

    private String title;
    private String link;
    private String description;
    private String ingredients;
    private Image image;

    public String getTitle() {
        return title;
    }

    public Recipe withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLink() {
        return link;
    }

    public Recipe withLink(String link) {
        this.link = link;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Recipe withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIngredients() {
        return ingredients;
    }

    public Recipe withIngredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public Image getImage() {
        return image;
    }

    public Recipe withImage(Image image) {
        this.image = image;
        return this;
    }
}
