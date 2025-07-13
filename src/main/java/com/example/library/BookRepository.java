package com.example.library;

import java.util.*;

public class BookRepository {
    private final Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public void deleteABook(int id) {
        books.remove(id);
    }

    public void updateAvailability(int id, boolean available) {
        if (books.containsKey(id)) {
            books.get(id).setAvailable(available);
        }
    }
}
