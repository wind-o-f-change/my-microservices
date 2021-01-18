package com.example.magazineservice;

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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
