package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int i = 0;
    	for(int r = 0; r < size; r++) {
    		for(int c = 0; c < size; c++) {
    			m[r][c] = str.substring(i++, i);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found = false;
    	int length = m.length;
    	for (int r = 0; !found && r < length; r++) {
    		for (int c = 0; !found && c < length; c++) {
    			if (word.substring(0,1).contentEquals(m[r][c])) {
    				found = checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c) || checkDown(word, r, c) || checkDiagUpRight(word, r, c) || checkDiagUpLeft(word, r, c) || checkDiagDownRight(word, r, c) || checkDiagDownLeft(word, r, c);
    			}
    		}
    	}
    	return found;
    }

	public boolean checkRight(String w, int r, int c)
   {
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c+i < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			c++;
			
		}
		
		
		
		return found;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c-i >= 0) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			c--;
			
		}
		
		
		
		return found;
	}

	public boolean checkUp(String w, int r, int c)
	{
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && r-i >= 0) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			r--;
			
		}
		
		
		return found;
	}

	public boolean checkDown(String w, int r, int c)
   {
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c+i < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			r++;
			
		}
		
		
		return found;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c+i < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			r++;
			c--;
			
		}
		
		
		return found;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c+i < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			r--;
			c--;
			
		}
		
		
		return found;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c+i < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			r--;
			c++;
			
		}
		
		
		return found;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0; //index of character within word
		while (match == true && c+i < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					found = true;
				}
			}
			else {
				match = false;
			}
			i++;
			r++;
			c++;
			
		}
		
		
		return found;
	}

    public String toString()
    {
 		return Arrays.toString(m) + "";
    }
}
