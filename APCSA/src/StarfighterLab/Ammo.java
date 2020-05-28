package StarfighterLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		super(0,0);
		speed = 5;
	}

	public Ammo(int x, int y)
	{
		super(x,y);
		speed = 5;
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s;
		
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), 5, 10);
	}
	
	
	public void move( String direction )
	{
		setY(getY() - speed);
		
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
