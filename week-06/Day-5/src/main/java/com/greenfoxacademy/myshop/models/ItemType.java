package com.greenfoxacademy.myshop.models;

public enum ItemType {
    clothesAndShoes("clothes and shoes"),
    electronics("electronics"),
    beveragesAndSnacks("beverages and snacks"),
    undefined("undefined");

    final String label;

    ItemType(String label) {
        this.label =label;
    }
}
