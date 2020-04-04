package FinalProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookStoreRunner {

	public static void main(String[] args) throws FileNotFoundException {
		
		String file = "src/FinalProject/books.dat";
		Bookstore bookie = new Bookstore(file);
		
		System.out.println(bookie);
		
		System.out.println("Author with the least number of books is: " + bookie.leastBooks());
		System.out.println("Author with the most number of books is: " + bookie.mostBooks());
		System.out.println("\n");
		
		Scanner keyboard = new Scanner(System.in);
		String reply = "";
		
		System.out.println("Which author do you want to search? \n[options: Austen, Jane; Maas, Sarah J; Orwell, George; Rowling, JK; Clare, Cassandra; Tolkien, JRR; Steinbeck, John; Meyer, Marissa] ");
		reply = keyboard.next();	
			
		System.out.println(bookie.searchAuth(reply));
			 

	}

}
