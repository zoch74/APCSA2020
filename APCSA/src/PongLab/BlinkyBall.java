package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
	   super(x,y);
	   super.setxSpeed(3);
	   super.setySpeed(1);


   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
	   super.setxSpeed(4);
	   super.setySpeed(2);


   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
	   //super.setxSpeed(xSpd);
	   //super.setySpeed(ySpd);


   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col, xSpd, ySpd);
	   //super.setxSpeed(xSpd);
	   //super.setySpeed(ySpd);

   }

   public Color randomColor()
   {
   		int r = (int)(Math.random() * (255 - 0) + 1);		//use Math.random()
 		int g = (int)(Math.random() * (255 - 0) + 1);
 		int b = (int)(Math.random() * (255 - 0) + 1);
 		return new Color(r,g,b);
   }
   
   @Override
   public void moveAndDraw(Graphics window)
   {
	   
	   super.setColor(randomColor());
	   super.moveAndDraw(window);
	   

   }
}