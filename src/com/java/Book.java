package java_essential.final_practice_assignment.book_library_management;

public class Book extends LibraryItem implements Borrowable{

    public Book(String title, String author, int year) {
        super(title, author, year);
    }

    // Override the displayItemDetails abstract method
    @Override
    public void displayItemDetails() {
        System.out.println("Book details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
        System.out.println("------------------------------------");
    }
}
