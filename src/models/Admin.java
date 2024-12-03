package models;

import controllers.BookController;

public class Admin extends Person {
    public Admin(int id, String name, int age) {
        super(id, name, age);
    }

    public void addBookToLibrary(BookController library, Book book) {
        library.adminAddBook(this, book);
    }

    public void removeBookFromLibrary(BookController library, int book_id) {
        library.adminRemoveBook(this, book_id);
    }
}
