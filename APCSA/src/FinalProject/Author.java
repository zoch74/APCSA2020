package FinalProject;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Author {

	String authName;
	Book[] books;
	
	public Author() {
		setAuthName("");
		setBooks(null);
	}
	
	public Author(String anm, String bks) {
		setAuthName(anm);
		setBooks(bks);
		sortBooks();
	}
	
	private void setAuthName(String anm) {
		authName = anm;
	}
	private void setBooks(String bks) {
		
		String[] cut = bks.split(",");
		//System.out.println(Arrays.toString(cut));
		Scanner ct = new Scanner(cut[0]);
		
		int size = ct.nextInt();
		books = new Book[size];
		
		for(int i=1; i<=size; i++)
		{
			Book temp = new Book(cut[i]);
			books[i-1] = temp;
		}		
		
	}
	
	public String getAuthName() {
		return authName;
	}
	public Book[] getBooks() {
		return books;
	}
	
	public void sortBooks() {
		
		for (int j = 1; j < books.length; j++)
	      {
	         String temp = books[j].getName();
	         Book tempB = books[j];
	         int possInd = j;
	         while (possInd > 0 && temp.compareTo(books[possInd - 1].getName()) < 0)
	         {
	            books[possInd] = books[possInd - 1];
	            possInd--;
	         }
	         books[possInd] = tempB;
	      }
	}
	
	
	public String toString() {
		
		String output = "";
		
		for (Book bk : getBooks()) {
			output += bk + " ";
		}
		
		return getAuthName() + ": " + output;
	}
	
	
	
}
