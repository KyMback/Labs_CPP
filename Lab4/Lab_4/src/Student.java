import java.util.ArrayList;

public class Student extends Thread {
	private Book studentBook;
	private Library library;
	public static ArrayList<Student> students = new ArrayList<>();
	
	public Student(Library lib) {
		library = lib;
		Student.students.add(this);
	}
	
	public synchronized void GetBook() {
		Book book = library.GetBookIfPossible();
		while(book == null) {
			Wait();
			book = library.GetBookIfPossible();
		}
		studentBook = book;
		ReturnBookToLibrary();
	}
	
	public void Wait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void ReadBook() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Book ReturnBookToLibrary() {
		ReadBook();
		return studentBook;
	}

	@Override
	public  void run() {
		
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			GetBook();
		}
	}
}
