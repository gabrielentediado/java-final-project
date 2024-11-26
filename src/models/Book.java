package models;
import java.util.ArrayList;


class Book{
    String name;
    int date, book_id;
    public Book(String name, int date, int book_id) {
        this.name = name;
        this.date = date;
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
}

class Library_books{
    private ArrayList<Book> bookslist;

    public Library_books(ArrayList<Book> bookslist) {
        this.bookslist = bookslist;
    }

    private void add_books(Book book){
        bookslist.add(book);
    }

    private void remove_books(Book book_id){
        bookslist.removeIf(bookslist -> bookslist.getBook_id().equals(book_id));
    }
}