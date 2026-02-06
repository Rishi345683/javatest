public class User {

    private Library library;

    public User(Library library) {
        this.library = library;
    }

    public void viewBooks() {
        library.displayBooks();
    }

    public void borrowBook(int bookId) {
        library.borrowBook(bookId);
    }

    public void returnBook(int bookId) {
        library.returnBook(bookId);
    }
}
