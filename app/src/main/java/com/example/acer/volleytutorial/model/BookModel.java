package com.example.acer.volleytutorial.model;

public class BookModel
{
    public String author;
    public String img;
    public String desc;
    public String book_title;

    public String getAuthor() {
        return author;
    }

    public String getImg() {
        return img;
    }

    public String getDesc() {
        return desc;
    }

    public String getBook_title() {
        return book_title;
    }

    public BookModel(String author, String img, String desc, String book_title) {

        this.author = author;
        this.img = img;
        this.desc = desc;
        this.book_title = book_title;
    }
}
