package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block
{

   public Wall()
   {
	   super(10,10);

   }


   //add the other Wall constructors
   public Wall(int x, int y) {
	   super(x, y);

   }
   
   public Wall(int x, int y, int w, int h) {
	   super(x, y, w, h);

   }
 
   public Wall(int x, int y, int w, int h, Color c) {
	   super(x, y, w, h, c);

   }

   //add a toString() method
   
   public String toString() {
		return super.toString();
	}
}