/**
 * ASSIGNMENT: Android RecyclerView with CardView Container Layout
 * -------------------------------------------------------------
 * Student Name   : Muhammad muneeb
 * Student ID     : 23-ag-9627
 * Course Unit    : cs-512(mobile_app)
 * Institution    : University of agriculture faisalabad
 * Generated on   : 2026-05-29 
 * -------------------------------------------------------------
 */

package com.example.recyclerviewcardview;

public class FoodItem {
    private String name;
    private String price;
    private String description;
    private String rating;
    private int imageResourceId; // Optional for local drawable resources
    private String imageUrl; // URL string for dynamic image loading via Glide

    // Constructor
    public FoodItem(String name, String price, String description, String rating, int imageResourceId, String imageUrl) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.imageResourceId = imageResourceId;
        this.imageUrl = imageUrl;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
