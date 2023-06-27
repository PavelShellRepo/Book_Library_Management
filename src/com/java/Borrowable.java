package java_essential.final_practice_assignment.book_library_management;


// Borrowable interface for issuing and returning items
public interface Borrowable {
    void checkout() throws ItemNotAvailableException;

    void returnItem();
}
