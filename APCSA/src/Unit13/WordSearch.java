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
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		boolean found = false;
		int len = w.length();
		boolean match = true;
		int i = 0;
		while (match == true && c < m.length) {
			if (w.substring(i,i+1).equals(m[r][c])) {
				match = true;
				if(i == len-1) {
					
				}
			}
			else {
				match = false;
			}
			i++;
			
		}
		
		
		
		return found;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
