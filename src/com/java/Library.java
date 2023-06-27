package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Library {
    final List<LibraryItem> libraryItems;

    public Library() {
        this.libraryItems = new ArrayList<>();
    }

    // Methods for adding, removing and searching library items
    public void addItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void removeItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public LibraryItem findItem(String title) throws ItemNotFoundException {
        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.getTitle().equals(title)) {
                return libraryItem;
            }
        }
        throw new ItemNotFoundException("Item not found: " + title);
    }

    // Nested static class LibraryStatistics
    public static class LibraryStatistics {
        // Method for counting the total number of books in the library
        public static int getTotalBooks(List<LibraryItem> items) {
            int count = 0;
            for (LibraryItem libraryItem : items) {
                if (libraryItem instanceof Book) {
                    count++;
                }
            }
            return count;
        }

        // Method for counting the number of available books in the library
        public static int getAvailableBooks(List<LibraryItem> items) {
            int count = 0;
            for (LibraryItem libraryItem : items) {
                if (libraryItem instanceof Book && libraryItem.isAvailable()) {
                    count++;
                }
            }
            return count;
        }
    }

    // Anonymous class for sorting books by author
    public void sortBooksByAuthor() {
        libraryItems.sort(new Comparator<LibraryItem>() {
            @Override
            public int compare(LibraryItem item1, LibraryItem item2) {
                return item1.getAuthor().compareTo(item2.getAuthor());
            }
        });
    }
}

// Exception for the situation when the element is unavailable
class ItemNotAvailableException extends Exception {
    public ItemNotAvailableException(String message) {
        super(message);
    }
}

// Exception for the situation when the element is not found
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}