package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;
	private boolean isColliding;

	public Ball()
	{
		//super(200,200);
		super();
		xSpeed = 3;
		ySpeed = 1;
		isColliding = false;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 4;
		ySpeed = 2;
		isColliding = false;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 4;
		ySpeed = 2;
		isColliding = false;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 4;
		ySpeed = 2;
		isColliding = false;
	}
	
	public Ball(int x, int y, int w, int h, int xSpd, int ySpd) {
		super(x, y, w, h);
		xSpeed = xSpd;
		ySpeed = ySpd;
		isColliding = false;
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x, y, w, h, c);
		xSpeed = xSpd;
		ySpeed = ySpd;
		isColliding = false;
	}
	

	   
   //add the set methods
   public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	
	public boolean getIsColliding() {
		return isColliding;
	}

	public void setxSpeed(int x) {
		xSpeed = x;
	}

	public void setySpeed(int y) {
		ySpeed = y;
	}
	public void setIsColliding(boolean isCol) {
		isColliding = isCol;
	}

public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  super.draw(window, Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball testBall = (Ball) obj;
		if (super.equals(obj) && this.getxSpeed() == testBall.getxSpeed() && this.getySpeed() == testBall.getySpeed()) {
			return true;
		}
		else {
			return false;
		}
	}   
	
	@Override
	public boolean didCollideLeft(Object obj) {
		
		//System.out.println(getX() <= ((Block)obj).getX() + ((Block)obj).getWidth());
		//return (getX() <= ((Block)obj).getX() + ((Block)obj).getWidth() + Math.abs(getxSpeed()));
		//System.out.println("collide left of " + obj);
		return (getX() + getWidth() >= ((Block)obj).getX());
	}
	
	@Override
	public boolean didCollideRight(Object obj) {
		
		//System.out.println(getX() >= ((Block)obj).getX() + ((Block)obj).getWidth());
		//return (getX() >= ((Block)obj).getX() && getX() < ((Block)obj).getX() + ((Block)obj).getWidth() + Math.abs(getxSpeed()));
		//System.out.println("collide right of " + obj);
		return (((Block)obj).getX() + ((Block)obj).getWidth() >= getX());
	}
	
	@Override
	public boolean didCollideTop(Object obj) {
		//return getY() >= ((Block)obj).getY() && getY() <= ((Block)obj).getY() + ((Block)obj).getHeight();
		//System.out.println("collide top of " + obj);
		return getY() <= ((Block)obj).getY();
	}
	
	@Override
	public boolean didCollideBottom(Object obj) {
		//return getY() + getHeight() >= ((Block)obj).getY() && getY() + getHeight() < ((Block)obj).getY() + ((Block)obj).getHeight();
		//System.out.println("collide bottom of " + obj);
		return (getY() >= ((Block)obj).getY() + ((Block)obj).getHeight());
	}
	
   //add a toString() method
	
	public String toString() {
		return super.toString() + " " + getxSpeed() + " " + getySpeed();
	}
	
}