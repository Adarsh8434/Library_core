package com.example.library;


public class LibraryMain {
    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        repo.addBook(new Book(1, "Dinesh Physics", "S.C Verma", "978026343344", true));
        repo.addBook(new Book(2, "Programming with Java", "Rammohan naidu", "93430134685991", true));
        repo.deleteABook(1);
        repo.addBook(new Book(3, "Indra The warrior", "Adarsh kumar", "97804d24935", true));
        System.out.println("All Books List:");
        repo.updateAvailability(2, false);
        for (Book b : repo.getAllBooks()) {
            System.out.println(b);
        }
        repo.updateAvailability(1, false);
    }
}
