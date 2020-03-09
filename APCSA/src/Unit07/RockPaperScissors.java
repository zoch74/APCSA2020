package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private int compRand;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player); 
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compRand = (int)Math.random() * 2;
		if (compRand == 0) {
			compChoice = "R";
		}
		else if (compRand == 1) {
			compChoice = "P";
		}
		else {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals("R")) {
			if (compChoice.equals("P")) {
				winner = "!Computer Wins <<Paper Covers Rock>>!";
			}
			else if (compChoice.equals("S")) {
				winner = "!Player Wins <<Rock Breaks Scissors>>!";
			}
			else {
				winner = "!Draw Game!";
			}
			
		}
		else if (playChoice.equals("P")) {
			if (compChoice.equals("S")) {
				winner = "!Computer Wins <<Scissors Cuts Paper>>!";
			}
			else if (compChoice.equals("R")) {
				winner = "!Player Wins <<Paper Covers Rock>>!";
			}
			else {
				winner = "!Draw Game!";
			}	
		}
		else if (playChoice.equals("S")) {
			if (compChoice.equals("R")) {
				winner = "!Computer Wins <<Rock Breaks Scissors>>!";
			}
			else if (compChoice.equals("P")) {
				winner = "!Player Wins <<Scissors Cuts Paper>>!";
			}
			else {
				winner = "!Draw Game!";
			}	
		}
		
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}