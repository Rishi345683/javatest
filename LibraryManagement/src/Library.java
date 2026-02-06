import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books=new ArrayList<>();
    
    public void addBook(Book book) {
    	books.add(book);
    	System.out.println("Book added successfully");
    }
    public void removeBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                System.out.println("Book removed successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    
    public void displayBooks() {
    	if(books.isEmpty()) {
    		System.out.println("No books available");
    		return;
    	}
    	for(Book book:books) {
    		book.displayBook();
    	}
    }
    public void borrowBook(int bookId) {
    	for(Book book:books) {
    		if(book.getBookId()==bookId) {
    			if(book.isAvailable()) {
    				book.setAvailable(false);
    				System.out.println("Book borrowed succcessfully");
    			}else {
    				System.out.println("Book is already borrowed");
    			}
    			return;
    		}
    	}
    	System.out.println("Book not found");
    }
    
    public void returnBook(int bookId) {
    	for(Book book:books) {
    		if(book.getBookId()==bookId) {
    			if(!book.isAvailable()) {
    				book.setAvailable(true);
    				System.out.println("Book returned successfully");
    			}else {
    				System.out.println("This book was not borrowed");
    			}
    			return;
    		}
    	}
    	System.out.println("Book not found");
    }
}
