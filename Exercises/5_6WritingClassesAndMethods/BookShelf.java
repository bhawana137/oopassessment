/*
Books
Design and implement a class called Book that contains instance data for title, author, publisher and copyright date.
Define that Book constructor to accept and initialize these data.
Include setter and getter methods for all instance data.
Include a toString method that returns a nicely formatted, multiline description of the book.
Create a driver class called Bookshelf, whose main method instantiates and updates several Book objects.
*/

package week5;
class Book {
    // Instance variables (attributes) to store information about the book
    private String title;
    private String author;
    private String publisher;
    private int copyrightYear;

    // Constructor to initialize the book details
    public Book(String title, String author, String publisher, int copyrightYear) {
        this.title = title;          // Set the book title
        this.author = author;        // Set the book author
        this.publisher = publisher;  // Set the book publisher
        this.copyrightYear = copyrightYear;  // Set the copyright year
    }

    // Getter and Setter methods for the title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for the author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter methods for the publisher
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter and Setter methods for the copyright year
    public int getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    // toString method to display the book details in a nice format
    @Override
    public String toString() {
        return "Book Details:\n" +
               "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Publisher: " + publisher + "\n" +
               "Copyright Year: " + copyrightYear + "\n";
    }
}

public class BookShelf {
    public static void main(String[] args) {
        // Creating 4 Nepali books with their details
        Book book1 = new Book("Muna Madan", "Laxmi Prasad Devkota", "Sangh Publications", 1936);
        Book book2 = new Book("China Harayeko Manchhe", "Hari Bansha Acharya", "Fine Print Publication", 2013);
        Book book3 = new Book("Shirishko Phool", "Parijat", "Ratna Pustak Bhandar", 1964);
        Book book4 = new Book("Karnali Blues", "Buddhisagar", "Fine Print Publication", 2010);

        // Printing the details of each book using the toString method
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        // Updating the details of book1 using setter methods
        book1.setTitle("Muna Madan (Updated Edition)");
        book1.setCopyrightYear(2023);

        // Printing the updated details of book1
        System.out.println("\nUpdated Book 1:");
        System.out.println(book1);
    }
}
