package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			do {
				out.print("Rock-Paper_Scissors - pick your weapon [R,P,S] :: ");
				player = keyboard.nextLine();
				RockPaperScissors round = new RockPaperScissors(player);
				System.out.println(round.toString());
				
				out.print("\nDo you want to play again? ");
				response = keyboard.nextLine().toLowerCase().charAt(0);
				
				
			} while (response != 'n');
			
	}
}



