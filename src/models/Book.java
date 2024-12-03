package models;


public class Book{
    private String name;
    private int date, book_id;
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
    @Override public String toString() {
        return "Book{" + "name='" + name + '\'' + ", date=" + date + ", book_id=" + book_id + '}';
    }
}