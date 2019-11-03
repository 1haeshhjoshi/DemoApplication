package com.example.lenovo.demoapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    String string;
    TextView profiledisc, profilesecondname, profilename;
    String profilediscriptionstring, profilesecondnamestring, profilenamestring;
    CircleImageView circleImageView;
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        circleImageView = findViewById(R.id.circleView);
        profiledisc = findViewById(R.id.profiledisc);
        profilesecondname = findViewById(R.id.profilesecondname);
        profilename = findViewById(R.id.profilename);
        backbutton = findViewById(R.id.backbutton);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int i = bundle.getInt("img");
            circleImageView.setImageResource(i);
        }

        profilediscriptionstring = getIntent().getStringExtra("details");
        profilesecondnamestring = getIntent().getStringExtra("cityname");
        profilenamestring = getIntent().getStringExtra("firstname");
        profiledisc.setText(profilediscriptionstring);
        profilesecondname.setText(profilesecondnamestring);
        profilename.setText(profilenamestring);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}