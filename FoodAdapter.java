/**
 * ASSIGNMENT: Android RecyclerView with CardView Container Layout
 * -------------------------------------------------------------
 * Student Name   : Muhammad muneeb
 * Student ID     : 23-ag-9627
 * Course Unit    : cs-512(mobile_app)
 * Institution    : University of agriculture faisalabad
 * Generated on   : 2026-05-29 (Aesthetic Studio Compiler Companion)
 * -------------------------------------------------------------
 */

package com.example.recyclerviewcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private final List<FoodItem> itemList;

    // Interface for click events
    public interface OnItemClickListener {
        void onItemClick(FoodItem item);
    }

    private OnItemClickListener clickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.clickListener = listener;
    }

    // Constructor
    public FoodAdapter(List<FoodItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the custom cardview layout
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FoodItem item = itemList.get(position);
        
        // Dynamically bind the dataset to card UI components
        holder.tvTitle.setText(item.getName());
        holder.tvSubtitle.setText(item.getPrice());
        holder.tvDescription.setText(item.getDescription());
        holder.tvMeta.setText(item.getRating());
        
        // Setup image: Load online image using Glide, fall back to local drawable if resourceId is provided
        if (item.getImageUrl() != null && !item.getImageUrl().isEmpty()) {
            Glide.with(holder.itemView.getContext())
                    .load(item.getImageUrl())
                    .placeholder(android.R.drawable.ic_menu_gallery)
                    .error(android.R.drawable.ic_menu_report_image)
                    .into(holder.imageView);
        } else if (item.getImageResourceId() != 0) {
            holder.imageView.setImageResource(item.getImageResourceId());
        } else {
            holder.imageView.setImageResource(android.R.drawable.ic_menu_gallery);
        }

        // Card Click Listener
        holder.itemView.setOnClickListener(v -> {
            if (clickListener != null) {
                clickListener.onItemClick(item);
            } else {
                Toast.makeText(v.getContext(), 
                    "Clicked: " + item.getName(), 
                    Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // ViewHolder holds caching logic for custom cards
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView tvTitle;
        public final TextView tvSubtitle;
        public final TextView tvDescription;
        public final TextView tvMeta;
        public final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.text_title);
            tvSubtitle = itemView.findViewById(R.id.text_subtitle);
            tvDescription = itemView.findViewById(R.id.text_description);
            tvMeta = itemView.findViewById(R.id.text_meta);
            imageView = itemView.findViewById(R.id.item_image);
        }
    }
}
