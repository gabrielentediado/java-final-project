package models;

import controllers.BookController;

public class Admin extends Person{
    private int admin_id;

    public Admin(int id, String name, int age, int admin_id) {
        super(id, name, age);
        this.admin_id = admin_id;
    }

    public void addBookToLibrary(BookController library, Book book) {
        library.add_books(book);
    }
    public void removeBookFromLibrary(BookController library, int book_id) {
        library.remove_books(book_id);
    }

    public int getAdminId() {
        return admin_id;
    };

}