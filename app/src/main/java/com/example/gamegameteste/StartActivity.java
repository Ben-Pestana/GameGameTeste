package com.example.gamegameteste;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {

    private Inventory inventoryOne = new Inventory();
    private ArrayList<String> items = inventoryOne.getItemList();
    private String[] inventoryList = items.toArray(new String[0]);
    private Button inventoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        wireWidgets();
        setOnClickListener();
        updateDisplay();
    }

    private void setOnClickListener() {
            inventoryButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showInventory(inventoryList);
                    updateDisplay();
                }
            });
        }



//        LayoutInflater inflater = getLayoutInflater();
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//        //set the custom view
//        builder.setView(inflater.inflate(R.layout.dialog_test, null));
//
//// Add the buttons
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                // User clicked OK button
//            }
//        });
//        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                // User cancelled the dialog
//            }
//        });
//// Set other dialog properties
//
//
//// Create the AlertDialog
//        AlertDialog dialog = builder.create();
//
//        //show the dialog
//        dialog.show();
//    }


    private void wireWidgets() {
        inventoryButton = findViewById(R.id.button_start_inventory);
    }

    private void showInventory(String[] inventoryList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.inventory)
                .setItems(inventoryList, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                    }
                });
        Dialog inventoryDialog = builder.create();
        inventoryDialog.show();
    }

    public void updateDisplay() {
        inventoryList = items.toArray(new String[0]);
    }
}

