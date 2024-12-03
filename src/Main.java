// biblioteca

import controllers.BookController;
import controllers.UserController;
import models.*;
import view.Mainview;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(1203, "Gabriel", 20);
        User user = new User(12323, "Fulano", 50);

        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Book> bookslist = new ArrayList<>();

        UserController users = new UserController(userList);
        BookController library = new BookController(bookslist);


        Book book = new Book("TESTE", 11/10/2003, 123321);
        admin.addBookToLibrary(library, book);

        library.displayBooks();
    }
}
