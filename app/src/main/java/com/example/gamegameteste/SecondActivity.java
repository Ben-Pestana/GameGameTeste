package com.example.gamegameteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private Button quitButton;
    private ImageView thumbScanner;
    private TextView scanThumb;

    private Inventory inventoryOne = new Inventory();
    private ArrayList<String> items = inventoryOne.getItemList();
    private String[] inventoryList = items.toArray(new String[0]);
    private Button inventoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        wireWidgets();
        setOnClickListener();
    }

    private void wireWidgets() {
        quitButton = findViewById(R.id.button_second_quit);
        thumbScanner = findViewById(R.id.imageview_second_thumbscanner);
        scanThumb = findViewById(R.id.textView_second_scanThumb);
    }

    private void setOnClickListener() {
        thumbScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.contains("thumb")) {

                }
            }
        });
    }
}
