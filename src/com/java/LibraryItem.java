package java_essential.final_practice_assignment.book_library_management;

abstract class LibraryItem {
    private final String title;
    private final String author;
    private final int year;
    private boolean available;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true; // Item is available by default
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    // Methods for processing issuance and return operations
    public void checkout() throws ItemNotAvailableException {
        if (available) {
            available = false;  // Issue an item, make it inaccessible
            System.out.println("Item checked out: " + title);
        } else {
            throw new ItemNotAvailableException("Item is not available for checkout: " + title);
        }
    }

    public void returnItem() {
        if(!available) {
            available = true; // Return the element, make it available
            System.out.println("Item returned: " +title);
        } else {
            System.out.println("Item is already available: " + title);
        }
    }

    // An abstract method that must be implemented by specific descendant classes
    public abstract void displayItemDetails();
}

