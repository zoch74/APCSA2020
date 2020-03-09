package ShapeLab;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
		//finish this constructor
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);

      //draw whatever you want
      
      window.setColor(Color.BLUE);
      window.fillRect(400, 200, 100, 100);
      window.setColor(Color.GREEN);
      window.drawString("hellu", 41, 51);
      
      window.setColor(Color.ORANGE);
	  window.fillRect(40, 50, 70, 90);
	  window.setColor(Color.darkGray);
	  window.drawString("BULBASAUR", 150, 300);
   
   }
   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public void moveAndDraw(Graphics window)
   {
    	//not needed yet
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return xPos;
   }

   public void setX( int x )
   {
	   xPos = x;
   }

   public int getY()
   {
   	return yPos;
   }

   public void setY( int x )
   {
	   yPos = x;
   }
   
   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}