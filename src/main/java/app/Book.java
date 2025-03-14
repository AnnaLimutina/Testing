package app;
//Create a simple program to manage a list of books using ArrayList:
//Use an ArrayList<Book> to store multiple Book objects.
//Allow the user to:
//Add new books.
//Remove a book by title.
//Display all books with their status.
//Create a Library Management System:
//Class: Book.
//        Fields: title, author, isAvailable.
//        Methods:
//borrow(): Set isAvailable to false.
//returnBook(): Set isAvailable to true.
//Write a program that creates multiple books, allows borrowing, and displays their status.

public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrow() {
        setAvailable(false);
    }

    public void returnBook(){
        setAvailable(true);
    }
}
