package Assignment3;

public class Main {
    public static void main(String[] args) {
  
        Book book = new Book(159, "The Last Drop", "Shakespeare");
        Magazine magazine = new Magazine(134, "AI World", 38);
        
        System.out.println("Book: [ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + "]");
        System.out.println("Magazine: [ID: " + magazine.getId() + ", Title: " + magazine.getTitle() + ", Issue: " + magazine.getIssueNumber() + "]");

        Library library = new Library("My Library");
        library.addItem(book);
        library.addItem(magazine);

        System.out.println("Library contains:");
        System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        System.out.println("- " + magazine.getTitle() + " Issue " + magazine.getIssueNumber());
    }
}