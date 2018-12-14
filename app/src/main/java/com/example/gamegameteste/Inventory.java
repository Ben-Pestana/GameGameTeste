package com.example.gamegameteste;

import android.os.Parcelable;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<String> items = new ArrayList<String>();
    private int weight;
    private int value;

    public Inventory() {
        items.add("1 Quarter");
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void removeItem(String itemToRemove) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(itemToRemove)) {
                items.remove(i);
            }
        }
    }

    public void addItem(String itemToAdd) {
        items.add(itemToAdd);
    }

    public ArrayList<String> getItemList() {
        return items;
    }
}