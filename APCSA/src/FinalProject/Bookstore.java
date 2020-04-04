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
	
	public Author mostBooks() {
		int maxNum = authors[0].getBooks().length;
		int maxInd = 0;
		
		for(int i = 1; i < authors.length; i++) {
			if (authors[i].getBooks().length > maxNum) {
				maxInd = i;
				maxNum = authors[i].getBooks().length;
			}
		}
		
		return authors[maxInd];
	}
	
	public Author leastBooks() {
		int lessNum = authors[0].getBooks().length;
		int lessInd = 0;
		
		for(int i = 1; i < authors.length; i++) {
			if (authors[i].getBooks().length < lessNum) {
				lessInd = i;
				lessNum = authors[i].getBooks().length;
			}
		}
		
		return authors[lessInd];
	}
	
	public String searchAuth(String name) {
		sortAuth();
		int left = 0;
		int mid = 0;
	    int right = authors.length - 1;
	    while (left < right)
	    {
		     int middle = (left + right) / 2;
		     //System.out.println("left = " + left);
		    // System.out.println("right = " + right);
		     //System.out.println("middle = " + middle);
		     
		     mid = middle;
		     if (right == left) {
		    	 //System.out.println(middle);
		    	 return authors[middle].toString();
		     }
		     else if (name.compareTo(authors[middle].getAuthName()) < 0)
		     {
	            right = middle - 1;
	            //System.out.println(right);
	            //System.out.println("Lesser than");
	         }
	         else if (name.compareTo(authors[middle].getAuthName()) > 0)
	         {
	            left = middle + 1;
	            
	         }
	         
	      }
	      return authors[mid].toString();
	}
	
	
	public String toString() {
		
		String output = "";
		
		for (Author auth : getAuthors()) {
			output += auth + "\n";
		}
		
		return getName() + ":\n\n" + output;
		
	}
	
	
	
}
