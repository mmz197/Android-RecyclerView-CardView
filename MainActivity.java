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

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<FoodItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Initialize RecyclerView from XML Design
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        // 2. Setup the Layout Manager
        // Set LinearLayoutManager with custom layout orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        // 3. Prepare dataset
        itemList = new ArrayList<>();
        populateSampleData(itemList);

        // 4. Set Adapter with the dataset
        adapter = new FoodAdapter(itemList);
        recyclerView.setAdapter(adapter);

        // 5. Handle Click events via Custom Interface
        adapter.setOnItemClickListener(item -> {
            Toast.makeText(MainActivity.this, 
                "Selected: " + item.getName() + " (" + item.getPrice() + ")", 
                Toast.LENGTH_SHORT).show();
        });
    }

    // Popularizes dummy dataset
    private void populateSampleData(List<FoodItem> foodList) {
        foodList.add(new FoodItem("Pepperoni Pizza", "$14.99 • Italian Classics", "Savor our freshly made hand-tossed artisan dough loaded with pepperoni.", "★ 4.8", 0, "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=150&auto=format&fit=crop&q=60"));
        foodList.add(new FoodItem("Avocado Caesar Salad", "$11.50 • Healthy Greens", "Crunchy crisp organic romaine tossed lightly in house Caesar vinaigrette.", "★ 4.5", 0, "https://images.unsplash.com/photo-1540420773420-3366772f4999?w=150&auto=format&fit=crop&q=60"));
        foodList.add(new FoodItem("Double Beef Burger", "$13.99 • Premium Grille", "Crafted with double custom-ground Black Angus patties, cheddar, brioche.", "★ 4.9", 0, "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=150&auto=format&fit=crop&q=60"));
        foodList.add(new FoodItem("Matcha Latte", "$5.50 • Hot Sips", "Stone-ground premium Japanese ceremonial green tea, milk, honey.", "★ 4.6", 0, "https://images.unsplash.com/photo-1536256263959-770b48d82b0a?w=150&auto=format&fit=crop&q=60"));
    }
}
