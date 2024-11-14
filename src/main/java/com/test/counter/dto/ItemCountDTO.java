package com.test.counter.dto;

public class ItemCountDTO {
    private String item;
    private int count;

    public ItemCountDTO(String item, int count) {
        this.item = item;
        this.count = count;
    }

    // Getters y Setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
