package StarfighterLab2;
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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo a : ammo) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Ammo a : ammo) {
			a.move("RIGHT");
		}
	}

	public void cleanEmUp()
	{
		if (ammo.size()>0) {
			for (int i = 0; i < ammo.size(); i++) {
				ammo.remove(0);
			}
		}
	}

	public Ammo getAmmo(int num) {
		return ammo.get(num);
	}
	
	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return ammo.toString();
	}
}
