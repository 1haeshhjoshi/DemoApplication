package com.example.lenovo.demoapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardviewprofileone, cardviewprofiletwo, cardviewprofilethree, cardviewprofilefour, cardviewprofilefive, cardviewprofilesix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardviewprofileone = findViewById(R.id.cardviewprofileone);
        cardviewprofiletwo = findViewById(R.id.cardviewprofiletwo);
        cardviewprofilethree = findViewById(R.id.cardviewprofilethree);
        cardviewprofilefour = findViewById(R.id.cardviewprofilefour);
        cardviewprofilefive = findViewById(R.id.cardviewprofilefive);
        cardviewprofilesix = findViewById(R.id.cardviewprofilesix);

        cardviewprofileone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("firstname","Hiram Borer");
                intent.putExtra("cityname","Sierra Leone");
                intent.putExtra("details","Quo earum qui cumque adipisci architecto.");
                intent.putExtra("img",R.drawable.ic_image_person_one);
                startActivity(intent);
            }
        });

        cardviewprofiletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("firstname","Taryn Nader");
                intent.putExtra("cityname","Malawi");
                intent.putExtra("details","Quidem officiis eos vero aut deserunt. Neque");
                intent.putExtra("img",R.drawable.ic_image_person_two);
                startActivity(intent);
            }
        });

        cardviewprofilethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("firstname","Crowford Mann");
                intent.putExtra("cityname","Albania");
                intent.putExtra("details","Non tempore ut voluptas velit qui. Architecto qui");
                intent.putExtra("img",R.drawable.ic_image_person_three);
                startActivity(intent);
            }
        });

        cardviewprofilefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("firstname","Alf Hermiston");
                intent.putExtra("cityname","Benin");
                intent.putExtra("details","Repellendus dolores voluptatem doloremque");
                intent.putExtra("img",R.drawable.ic_image_person_four);
                startActivity(intent);
            }
        });

        cardviewprofilefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("firstname","Nicklaus Haag");
                intent.putExtra("cityname","Anguilla");
                intent.putExtra("details","Eum illo deleniti deserunt. Rerum illo explicabo");
                intent.putExtra("img",R.drawable.ic_image_person_five);
                startActivity(intent);
            }
        });

        cardviewprofilesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("firstname","Mrs. Idella Hauck");
                intent.putExtra("cityname","Mongolia");
                intent.putExtra("details","Minima ut sed. Molestiae quas eos rerum unde et");
                intent.putExtra("img",R.drawable.ic_image_person_six);
                startActivity(intent);
            }
        });
    }
}