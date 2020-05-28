package StarfighterLab2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		super(0,0,30,30);
		speed = 0;
		try
		{
			URL url = getClass().getResource("/StarfighterLab/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public Alien(int x, int y)
	{
		super(x,y,30,30);
		speed = 1;
		try
		{
			URL url = getClass().getResource("/StarfighterLab/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public Alien(int x, int y, int s)
	{
		super(x,y,30,30);
		speed = s;
		try
		{
			URL url = getClass().getResource("/StarfighterLab/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/StarfighterLab/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if (direction.equals("LEFT")) {
			setX(getX() - speed);

		}
		else if (direction.equals("RIGHT")) {
			setX(getX() + speed);
		}
		else if (direction.equals("DOWN")) {
			setY(getY() + speed);
		}
		else if (direction.equals("UP")) {
			setY(getY() - speed);
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
