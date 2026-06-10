package com.linkitsoft.multi_languagefoodorderingapp.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.linkitsoft.multi_languagefoodorderingapp.R;
import com.linkitsoft.multi_languagefoodorderingapp.databinding.ActivityHomeScreenBinding;
import com.linkitsoft.multi_languagefoodorderingapp.model.FoodItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    ActivityHomeScreenBinding binding;
    List<TextView> chipsList;
    List<FoodItem> foodItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        initViews();
        clickListener();
        selectedChipListener();
    }

    private void initViews() {
        chipsList = new ArrayList<>();
        foodItemList = new ArrayList<>();
        selectChip(binding.chipPizzaText);
        loadDummyData();
    }

    private void selectedChipListener() {
        for (TextView chip : chipsList) {
            chip.setOnClickListener(view -> selectChip(chip));
        }
    }

    private void selectChip(TextView selectedChip) {
        for (TextView chip : chipsList) {
            chip.setSelected(false);
        }
        selectedChip.setSelected(true);
    }

    private void clickListener() {
        /*binding.ivHeart.setOnClickListener(view -> {
            *//*if(binding.ivHeart.isSelected()){
                binding.ivHeart.setSelected(false);
            }
            else{
                binding.ivHeart.setSelected(true);
            }*//*
            binding.ivHeart.setSelected(!binding.ivHeart.isSelected());
        });*/
    }

    private void loadDummyData() {

        // For Chip
        chipsList.add(binding.chipPizzaText);
        chipsList.add(binding.chipBurgerText);
        chipsList.add(binding.chipDrinksText);

        // For Food
        foodItemList.add(new FoodItem("Burger", 10.5, true));
        foodItemList.add(new FoodItem("Pizza", 15, false));
        foodItemList.add(new FoodItem("Drinks", 5.2, false));

        foodItemList.get(1).setFavourite(true);
    }

}