package FinalProject;

public class Author {

	String authName;
	Book[] books;
	
	public Author() {
		setAuthName("");
		setBooks(null);
	}
	
	public Author(String anm, Book[] bks) {
		setAuthName(anm);
		setBooks(bks);
	}
	
	private void setAuthName(String anm) {
		authName = anm;
	}
	private void setBooks(Book[] bks) {
		books = bks;
	}
	
	public String getAuthName() {
		return authName;
	}
	public Book[] getBooks() {
		return books;
	}
	
	
	
	
	
}
