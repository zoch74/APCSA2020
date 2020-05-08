package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

	int xSpeed, ySpeed;
   //instance variables
		public SpeedUpBall()
	   {
			super();
			super.setxSpeed(3);
			super.setySpeed(1);
	   }

	   public SpeedUpBall(int x, int y)
	   {
		   super(x,y);
		   super.setxSpeed(4);
		   super.setySpeed(2);


	   }

	   public SpeedUpBall(int x, int y, int wid, int ht)
	   {
		   super(x,y,wid,ht);
		   super.setxSpeed(4);
		   super.setySpeed(2);


	   }

	   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht);
		   super.setxSpeed(4);
		   super.setySpeed(2);


	   }

	   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht,col);
		   super.setxSpeed(4);
		   super.setySpeed(2);

	   }
	   /*
	   @Override
		public boolean didCollideLeft(Object obj) {
			
			//System.out.println(getX() <= ((Block)obj).getX() + ((Block)obj).getWidth());
			//return (getX() <= ((Block)obj).getX() + ((Block)obj).getWidth() + Math.abs(getxSpeed()));
			//System.out.println("collide left of " + obj);
			if (getX() + getWidth() >= ((Block)obj).getX()) {
				if (super.getxSpeed() >= 0) {
					super.setxSpeed(getxSpeed() + 1);
				}
				else if (super.getxSpeed() < 0) {
					   super.setxSpeed(getxSpeed() - 1);
				}
				if (super.getySpeed() >= 0) {
					super.setySpeed(getySpeed() + 1);
				}
				else if (super.getySpeed() < 0) {
					super.setySpeed(getySpeed() - 1);
				}
				return true;
				
			}
			return false;
		}
		
		@Override
		public boolean didCollideRight(Object obj) {
			
			//System.out.println(getX() >= ((Block)obj).getX() + ((Block)obj).getWidth());
			//return (getX() >= ((Block)obj).getX() && getX() < ((Block)obj).getX() + ((Block)obj).getWidth() + Math.abs(getxSpeed()));
			//System.out.println("collide right of " + obj);
			if (((Block)obj).getX() + ((Block)obj).getWidth() >= getX()) {
				if (super.getxSpeed() >= 0) {
					super.setxSpeed(getxSpeed() + 1);
				}
				else if (super.getxSpeed() < 0) {
					   super.setxSpeed(getxSpeed() - 1);
				}
				if (super.getySpeed() >= 0) {
					super.setySpeed(getySpeed() + 1);
				}
				else if (super.getySpeed() < 0) {
					super.setySpeed(getySpeed() - 1);
				}
				return true;
			}
			return false;
		}
		
		@Override
		public boolean didCollideTop(Object obj) {
			//return getY() >= ((Block)obj).getY() && getY() <= ((Block)obj).getY() + ((Block)obj).getHeight();
			//System.out.println("collide top of " + obj);
			if (getY() <= ((Block)obj).getY()) {
				if (super.getxSpeed() >= 0) {
					super.setxSpeed(getxSpeed() + 1);
				}
				else if (super.getxSpeed() < 0) {
					   super.setxSpeed(getxSpeed() - 1);
				}
				if (super.getySpeed() >= 0) {
					super.setySpeed(getySpeed() + 1);
				}
				else if (super.getySpeed() < 0) {
					super.setySpeed(getySpeed() - 1);
				}
				return true;
			}
			return false;
		}
		
		@Override
		public boolean didCollideBottom(Object obj) {
			//return getY() + getHeight() >= ((Block)obj).getY() && getY() + getHeight() < ((Block)obj).getY() + ((Block)obj).getHeight();
			//System.out.println("collide bottom of " + obj);
			if (getY() >= ((Block)obj).getY() + ((Block)obj).getHeight()) {
				if (super.getxSpeed() >= 0) {
					super.setxSpeed(getxSpeed() + 1);
				}
				else if (super.getxSpeed() < 0) {
					   super.setxSpeed(getxSpeed() - 1);
				}
				if (super.getySpeed() >= 0) {
					super.setySpeed(getySpeed() + 1);
				}
				else if (super.getySpeed() < 0) {
					super.setySpeed(getySpeed() - 1);
				}
				return true;
			}
			return false;
		}
	   */
	   
	   
	   /*
	   @Override
	   public int getxSpeed() {
		   return xSpeed;
	   }
	   
	   @Override
	   public int getySpeed() {
		   return ySpeed;
	   }
	*/
		
	   @Override
	   public void setxSpeed( int xSpd )
	   {
		   System.out.println("xSpeed BEFORE: " + xSpeed);
		   if (super.getIsColliding() == true) {
			   if (xSpd >= 0) {
				   xSpeed = xSpd + 1;
			   }
			   else if (xSpeed < 0) {
				   xSpeed = xSpd - 1;
			   }
			   else {
				   xSpeed = xSpd;
			   }
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
		   if (super.getIsColliding() == true) {
			   if (ySpd >= 0) {
				   ySpeed = ySpd + 1;
			   }
			   else if (xSpeed < 0) {
				   ySpeed = ySpd - 1;
			   }
			   else {
				   ySpeed = ySpd;
			   }
		   }
		   else {
			   ySpeed = ySpd;
		   }
		   
		   System.out.println("ySpeed AFTER: " + ySpeed);
	
	   }
	   
	   
}

