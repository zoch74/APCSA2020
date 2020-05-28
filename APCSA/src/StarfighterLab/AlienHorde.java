package StarfighterLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		int x = 0;
		int y = 10;
		aliens = new ArrayList<Alien>();
		for (int i = 0; i < size; i++) {
			x = (int)(Math.random() * (800 - 0) + 1);
			aliens.add(new Alien(x,y,1));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a : aliens) {
			a.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++) {
			Ammo ammo = shots.get(i);
			for (int j = 0; j < aliens.size(); j++) {
				Alien alienTwo = aliens.get(j);
				if (ammo.getX() + ammo.getWidth() >= alienTwo.getX() && ammo.getX() <= (alienTwo.getX() + alienTwo.getWidth())) {
					if (ammo.getY() <= alienTwo.getY() + alienTwo.getHeight() && ammo.getY() >= alienTwo.getY()) {
						System.out.println("alien has been shot");
						aliens.remove(j);
						System.out.println("UPDATED ALIENS LIST " + aliens);
					}	
				}
			}
		}
	}
	
	public void hitBottom(Graphics window) {
		for (Alien a : aliens) {
			if (a.getY() >= 590) {
				a.setY(10);
			}
		}
		drawEmAll(window);
	}
	
	public boolean hitRight(Graphics window) {
		for (Alien a : aliens) {
			if (a.getX() >= 790) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hitLeft(Graphics window) {
		for (Alien a : aliens) {
			if (a.getX() <= 10) {
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		return aliens.toString();
	}
}
