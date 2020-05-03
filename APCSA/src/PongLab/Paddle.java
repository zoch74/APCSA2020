package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   
   public void setSpeed(int s) {
	   speed = s;
   }
   public int getSpeed() {
	   return speed;
   }

   public Paddle()
   {
	   super(10,10);
      setSpeed(5);
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x, y);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int s) {
	   super(x, y);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h) {
	   super(x, y, w, h);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int w, int h, int s) {
	   super(x, y, w, h);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s) {
	   super(x, y, w, h, c);
	   setSpeed(s);
   }



   public void moveUpAndDraw(Graphics window)
   {
	  super.draw(window, Color.white);
	   

	   setY(getY()-speed);
	   
	      
	   super.draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);
	   
	   
	   setY(getY()+speed);
	   
	      
	   super.draw(window);

   }

   //add get methods
   
   
   //add a toString() method
   
   public String toString() {
		return super.toString() + " " + getSpeed();
	}
}