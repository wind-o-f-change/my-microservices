package com.example.bookservice;

import java.util.Random;

public class Magazine {
    private int id = new Random().nextInt();
    private String bookName = "some Magazine num #" + id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
