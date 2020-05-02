package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		//super(200,200);
		super();
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 4;
		ySpeed = 2;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 4;
		ySpeed = 2;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 4;
		ySpeed = 2;
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x, y, w, h, c);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	

	   
   //add the set methods
   public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setxSpeed(int x) {
		xSpeed = x;
	}

	public void setySpeed(int y) {
		ySpeed = y;
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

   //add a toString() method
	
	public String toString() {
		return super.toString() + " " + getxSpeed() + " " + getySpeed();
	}
	
}