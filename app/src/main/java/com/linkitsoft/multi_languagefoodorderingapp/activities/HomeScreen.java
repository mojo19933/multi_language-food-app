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

import java.util.Arrays;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    ActivityHomeScreenBinding binding;

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
    }

    private void initViews() {
        binding.chipPizzaText.setSelected(true);
        binding.chipBurgerText.setSelected(false);
        binding.chipDrinksText.setSelected(false);
    }

    private void clickListener() {
        binding.chipPizzaText.setOnClickListener(view -> {
            selectChip(binding.chipPizzaText);
        });
        binding.chipBurgerText.setOnClickListener(view -> {
            selectChip(binding.chipBurgerText);
        });
        binding.chipDrinksText.setOnClickListener(view -> {
            selectChip(binding.chipDrinksText);
        });
    }


    List<TextView> chips = Arrays.asList(
            binding.chipPizzaText,
            binding.chipBurgerText,
            binding.chipDrinksText
    );

    private void selectChip(TextView selectedChip) {
        for (TextView chip : chips) {
            chip.setSelected(false);
        }
        selectedChip.setSelected(true);
    }

}