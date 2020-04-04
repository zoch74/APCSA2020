package FinalProject;

public class Book {

	private String name;
	
	public Book() {
		setName("");
	}
	
	public Book(String name) {
		setName(name);
	}
	
	private void setName(String nm) {
		name = nm;
	}
		
	public String getName() {
		return name;
	}
	
	public String toString() {
		
		return name + "";
	}
	
	

}
