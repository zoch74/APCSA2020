package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
		private int xSpeed;
		private int ySpeed;
		
	
		public SpeedUpBall()
	   {
			super();
			xSpeed = 3;
			ySpeed = 1;
	   }

	   public SpeedUpBall(int x, int y)
	   {
		   super(x,y);
		   xSpeed = 4;
		   ySpeed = 2;


	   }

	   public SpeedUpBall(int x, int y, int wid, int ht)
	   {
		   super(x,y,wid,ht);
		   xSpeed = 4;
		   ySpeed = 2;


	   }

	   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht);
		   xSpeed = 4;
		   ySpeed = 2;


	   }

	   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht,col);
		   xSpeed = 4;
		   ySpeed = 2;

	   }
	   
	   @Override
	   public int getxSpeed() {
		   return xSpeed;
	   }
	   
	   @Override
	   public int getySpeed() {
		   return ySpeed;
	   }

	   @Override
	   public void setxSpeed( int xSpd )
	   {
		   System.out.println("xSpeed BEFORE: " + xSpeed);
		   if (xSpd >= 0) {
			   xSpeed = xSpd + 3;
		   }
		   else if (xSpeed < 0) {
			   xSpeed = xSpd - 3;
		   }
		   else {
			   xSpeed = xSpd;
		   }
		   System.out.println("xSpeed AFTER: " + xSpeed);
	
	   }
	   
	   @Override
	   public void setySpeed( int ySpd )
	   {
		   System.out.println("ySpeed BEFORE: " + ySpeed);
		   if (ySpd >= 0) {
			   ySpeed = ySpd + 3;
		   }
		   else if (xSpeed < 0) {
			   ySpeed = ySpd - 3;
		   }
		   else {
			   ySpeed = ySpd;
		   }
		   System.out.println("ySpeed AFTER: " + ySpeed);
	
	   }
	   
	   
}

