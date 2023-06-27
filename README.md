# Book_Library_Management
The program is a simple library management system. It allows you to add, remove and search library items, as well as issue and return items. The program is implemented in Java and consists of several classes.

The LibraryItem class is an abstract class and serves as a base class for all library elements. It contains common properties for all items: title, author, year and availability. The class also defines methods for accessing the properties and methods for handling issuing and returning the item. The displayItemDetails() method is abstract and must be implemented in specific descendant classes.

The Borrowable interface defines checkout() and returnItem() methods for issuing and returning items. The Book class implements this interface and adds its own specific implementation of the displayItemDetails() method.

The Library class represents a library and contains a list of libraryItems. It provides methods for adding, removing, and finding items in the library. Also defined inside the class is a nested static class LibraryStatistics, which contains methods for counting statistics of books in the library. The Library class also has the sortBooksByAuthor() method, which sorts books by author.

The program defines two custom exceptions: ItemNotAvailableException and ItemNotFoundException. ItemNotAvailableException is used when an item is not available for fetch, and ItemNotFoundException is used when an item is not found in the library.

The LibrarySystem class is a test class that creates a library object, adds books to the library, and performs some operations, such as issuing and returning books, searching for books by title, displaying statistics, and sorting books by author. This class demonstrates the use of the other classes and their methods.
