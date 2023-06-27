package com.java;

// Test class to check the program
public class Main {
    public static void main(String[] args) {
        // Create a library object
        Library library = new Library();

        // Creating Books
        Book book1 = new Book("Java Programming", "John Smith", 2021);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020);
        Book book3 = new Book("C# Essentials", "David Johnson", 2019);

        // Adding books to the library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        // Display book details
        book1.displayItemDetails();
        book2.displayItemDetails();
        book3.displayItemDetails();

        try {
            // Checking the operations of issuing and returning books
            book1.checkout();
            book2.checkout();
            book2.returnItem();
            book3.checkout();
        } catch (ItemNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Search books by title
        try {
            LibraryItem foundItem = library.findItem("Python Basics");
            System.out.println("Found item: " + foundItem.getTitle());
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Output library attendance statistics
        int totalBooks = Library.LibraryStatistics.getTotalBooks(library.libraryItems);
        int availableBooks = Library.LibraryStatistics.getAvailableBooks(library.libraryItems);
        System.out.println("Total books: " + totalBooks);
        System.out.println("Available books: " + availableBooks);
        System.out.println("------------------------------------");

        // Sort books by author
        library.sortBooksByAuthor();

        //Display details of sorted books
        System.out.println(" ");
        System.out.println("Displaying details of sorted books by author: ");
        System.out.println(" ");
        for (LibraryItem item : library.libraryItems) {
            item.displayItemDetails();
        }
    }
}
