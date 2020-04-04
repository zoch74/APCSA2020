package FinalProject;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Bookstore {

	String bookstore;
	Author[] authors;
	
	public Bookstore() throws FileNotFoundException {
		setAuthors("");
	}
	
	public Bookstore(String file) throws FileNotFoundException {
		setAuthors(file);
		sortAuth();
	}
	
	private void setAuthors(String fl) throws FileNotFoundException {
		
		Scanner file = new Scanner(new File(fl));
		bookstore = file.nextLine();
		//System.out.println(bookstore);
		int numAuth = file.nextInt();
		//System.out.println(numAuth);
		
		authors = new Author[numAuth];
		//System.out.println(Arrays.toString(authors));
		
		file.nextLine();
		
		for(int i=0; i<numAuth; i++)
		{
			String ath = file.nextLine();
			//System.out.println(ath);
			String books = file.nextLine();	
			//System.out.println(books);
			Author temp = new Author(ath, books);
			authors[i] = temp;
		}
		
		
	}
	
	public String getName() {
		return bookstore;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	private void sortAuth() {
		
		for (int j = 1; j < authors.length; j++)
	      {
	         String temp = authors[j].getAuthName();
	         Author tempA = authors[j];
	         int possInd = j;
	         
	         while (possInd > 0 && temp.compareTo(authors[possInd - 1].getAuthName()) < 0)
	         {
	            authors[possInd] = authors[possInd - 1];
	            possInd--;
	         }
	         authors[possInd] = tempA;
	      }
		
	}
	
	
	
	public String toString() {
		
		String output = "";
		
		for (Author auth : getAuthors()) {
			output += auth + "\n";
		}
		
		return getName() + ":\n\n" + output;
		
	}
	
	
	
}
