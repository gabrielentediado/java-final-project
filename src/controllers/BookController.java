package controllers;

import models.Admin;
import models.Book;

import java.util.ArrayList;

public class BookController {
    private ArrayList<Book> bookslist;

    public BookController(ArrayList<Book> bookslist) {
        this.bookslist = bookslist;
    }

    public void add_books(Book book) {
        bookslist.add(book);
    }

    public void remove_books(int book_id) {
        bookslist.removeIf(book -> book.getBook_id() == book_id);
    }

    public void displayBooks() {
        for (Book book : bookslist) {
            System.out.println(book);
        }
    }

    public void adminAddBook(Admin admin, Book book) {
        admin.addBookToLibrary(this, book);
    }

    public void adminRemoveBook(Admin admin, int book_id) {
        admin.removeBookFromLibrary(this, book_id);
    }
}
