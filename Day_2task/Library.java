import java.util.*;
public class Library{
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 101);
        Magazine magazine = new Magazine("Tech Monthly", 102);
        DVD dvd = new DVD("Java Tutorial DVD", 103);

        Librarian librarian = new Librarian();

        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);

        book.borrowItem();

        dvd.borrowItem();

        System.out.println("Magazine cannot be borrowed because it is reference-only.");

        System.out.println("\nLibrary Items:");
        librarian.printDetails();
    }
}
abstract class LibraryItem{
    String title;
    int ItemId;
    boolean isAvailable;
    
    abstract int getLoanPeriod();

    LibraryItem(String title, int ItemId){
        this.title = title;
        this.ItemId = ItemId;
        this.isAvailable = true;
    }
     void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + ItemId);
        System.out.println("Available: " + isAvailable);
        System.out.println("Loan Period: " + getLoanPeriod() + " days");
    }

} 

interface Borrowable{
    void borrowItem();
    void returnItem();
}
class Book extends LibraryItem implements Borrowable{
    Book(String title, int ItemId){
        super(title,ItemId);
    }

    @Override
    int getLoanPeriod() {
        return 10;
    }
     @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

class DVD extends LibraryItem implements Borrowable{
    DVD(String title, int ItemId){
        super(title,ItemId);
    }

    @Override
    int getLoanPeriod() {
        return 7;
    }
     @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 8;
    }
}
class Librarian {
    List<LibraryItem> libraryItems = new ArrayList<>();

    void addItem(LibraryItem item) {
        libraryItems.add(item);
    }

    void printDetails() {
        for (LibraryItem item : libraryItems) {
            item.displayDetails();
            System.out.println("-------------------");
        }
    }
}




