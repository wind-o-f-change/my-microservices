package com.example.bookservice;

import java.util.Random;

public class Book {
    private int id = new Random().nextInt();
    private String bookName = "some book num #" + id;

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
