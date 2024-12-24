import java.util.*; 
// Importing the java.util package to use utility classes such as ArrayList and Scanner.

class Book {
    private String title; // Title of the book.
    private String author; // Author of the book.
    private boolean isBorrowed; // Flag to check if the book is borrowed or available.

    // Constructor to initialize the Book object with title and author.
    public Book(String title, String author) {
        this.title = title; // Assigning the provided title to the Book's title.
        this.author = author; // Assigning the provided author to the Book's author.
        this.isBorrowed = false; // Initially, the book is not borrowed.
    }

    // Getter method to retrieve the title of the book.
    public String getTitle() {
        return title; 
    }

    // Method to check if the book is borrowed or not.
    public boolean isBorrowed() {
        return isBorrowed; 
    }

    // Method to mark the book as borrowed.
    public void borrowBook() {
        isBorrowed = true; 
    }

    // Method to mark the book as returned.
    public void returnBook() {
        isBorrowed = false; 
    }
}

class Library {
    private ArrayList<Book> books; // List to store all books in the library.

    // Constructor to initialize the Library object and the books list.
    public Library() {
        books = new ArrayList<>(); 
    }

    // Method to add a new book to the library.
    public void addBook(String title, String author) {
        books.add(new Book(title, author)); 
        // Creating a new Book object with the provided title and author and adding it to the books list.
        System.out.println("Book Added"); // Informing the user that the book has been added.
    }

    // Method to borrow a book from the library.
    public void borrowBook(String title) {
        for (Book book : books) { 
            // Iterating through the list of books to find the matching title.
            if (book.getTitle().equals(title)) { 
                // If a book with the matching title is found:
                if (!book.isBorrowed()) { 
                    // Check if the book is not already borrowed.
                    book.borrowBook(); 
                    // Mark the book as borrowed.
                    System.out.println("Book Borrowed"); // Inform the user that the book has been borrowed.
                    return; 
                } else {
                    // If the book is already borrowed:
                    System.out.println("Book not available"); 
                    return; 
                }
            }
        }
        // If no book with the matching title is found:
        System.out.println("Book not found"); 
    }

    // Method to return a borrowed book to the library.
    public void returnBook(String title) {
        for (Book book : books) { 
            // Iterating through the list of books to find the matching title.
            if (book.getTitle().equals(title)) { 
                // If a book with the matching title is found:
                if (book.isBorrowed()) { 
                    // Check if the book is currently borrowed.
                    book.returnBook(); 
                    // Mark the book as returned.
                    System.out.println("Book returned"); 
                    // Inform the user that the book has been returned.
                    return; 
                } else {
                    // If the book was not borrowed:
                    System.out.println("Book was not borrowed"); 
                    return; 
                }
            }
        }
        // If no book with the matching title is found:
        System.out.println("Book not found"); 
    }
}

public class LibraryManagmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // Creating a Scanner object to take user input from the console.

        Library library = new Library(); 
        // Creating a Library object to manage the library system.

        int N = sc.nextInt(); 
        // Reading the number of operations the user wants to perform.
        sc.nextLine(); 
        // Consuming the newline character after the integer input.

        for (int i = 0; i < N; i++) { 
            // Looping through the number of operations.
            String operation = sc.nextLine(); 
            // Reading the user's operation command (e.g., "add", "borrow", or "return").
            String[] parts = operation.split(" "); 
            // Splitting the operation into parts based on spaces for easier processing.
            String command = parts[0]; 
            // Extracting the command (e.g., "add", "borrow", or "return").

            switch (command) { 
                // Determining which operation to perform based on the command.
                case "add":
                    String title = parts[1]; // Extracting the book title from the input.
                    String author = parts[2]; // Extracting the book author from the input.
                    library.addBook(title, author); 
                    // Adding the book to the library.
                    break;

                case "borrow":
                    title = parts[1]; // Extracting the book title to be borrowed.
                    library.borrowBook(title); 
                    // Attempting to borrow the book.
                    break;

                case "return":
                    title = parts[1]; // Extracting the book title to be returned.
                    library.returnBook(title); 
                    // Attempting to return the book.
                    break;

                default:
                    // If the command is invalid:
                    System.out.println("Invalid operation"); 
                    break;
            }
        }
        sc.close(); 
        // Closing the Scanner to free up resources.
    }
}
