package FinalProject;

import java.io.FileNotFoundException;

public class BookStoreRunner {

	public static void main(String[] args) throws FileNotFoundException {
		
		String file = "src/FinalProject/books.dat";
		Bookstore bookie = new Bookstore(file);
		
		System.out.println(bookie);

	}

}
