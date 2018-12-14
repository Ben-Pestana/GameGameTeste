package com.example.gamegameteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    private ImageView lock;
    private ImageView mansion;
    private ImageView market;
    private ImageView prison;

    private TextView marketText;
    private TextView prisonText;
    private TextView mansionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        wireWidgets();
        setOnClickListener();
    }

    private void wireWidgets() {

        lock = findViewById(R.id.imageView_map_lock);
        mansion = findViewById(R.id.imageView_map_mansion);
        prison = findViewById(R.id.imageView_map_prison);
        market = findViewById(R.id.imageView_map_market);

        marketText = findViewById(R.id.textView_map_market);
        mansionText = findViewById(R.id.textView_map_mansion);
        prisonText = findViewById(R.id.textView_map_prison);

    }

    private void setOnClickListener() {

        lock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                lock.setVisibility(View.INVISIBLE);
            }
        });

        mansion.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               setInvisible();
           }

        });

        prison.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setInvisible();
            }

        });

        market.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setInvisible();
            }

        });
    }

    private void setInvisible() {

        mansion.setVisibility(View.INVISIBLE);
        prison.setVisibility(View.INVISIBLE);
        market.setVisibility(View.INVISIBLE);
        prisonText.setVisibility(View.INVISIBLE);
        marketText.setVisibility(View.INVISIBLE);
        mansionText.setVisibility(View.INVISIBLE);

    }
}
