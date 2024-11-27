package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Diet_Planner extends AppCompatActivity {

    CardView Card1, Card2, Card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_planner);

        Card1 = findViewById(R.id.Card1);
        Card2 = findViewById(R.id.Card2);
        Card3 = findViewById(R.id.Card3);

        //CardView
        Card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(Diet_Planner.this,Food_Recommend.class);
                startActivity(categoryIntent);
            }
        });
        Card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(Diet_Planner.this,Meal_Plans.class);
                startActivity(categoryIntent);
            }
        });
        Card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(Diet_Planner.this,Nutritional_Analysis.class);
                startActivity(categoryIntent);
            }
        });

    }
}