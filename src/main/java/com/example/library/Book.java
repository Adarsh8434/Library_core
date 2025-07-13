package com.example.library;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(Integer id,String title,String author,String isbn,boolean available) {
        this.id =id;
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.available=available;
    }


    public Integer getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Book{id=" + id + ",title='" + title + "', author='" + author + "', isbn='" + isbn + "', available=" + available + "}";
    }
}
