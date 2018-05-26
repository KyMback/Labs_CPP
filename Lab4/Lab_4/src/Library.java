import java.util.*;

public class Library {
	
	public static Library library = new Library();
	
	private LinkedList<Book> books = new LinkedList<>();
	
	public int GetNumberOfBooks() {
		return books.size();
	}
	
	public Library() {
		books.add(new Book());
		books.add(new Book());
	}
	
	public Book GetBookIfPossible() {
		if(books.isEmpty()) {
			return null;
		}
		return books.remove(0);
	}
	
	public void ReturnBook(Book book) {
		books.add(book);
	}
}
