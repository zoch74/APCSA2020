package FinalProject;

import java.io.FileNotFoundException;

public class AuthorRunner {

	public static void main(String[] args) throws FileNotFoundException {
		
		String file = "src/FinalProject/books2.dat";
		Author test = new Author("Meyer, Marissa", "4, Cinder, The Stars Above, Scarlet, Renegades,");
		
		System.out.println(test);

	}

}
