package StarfighterLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	//private Ammo ammo;
	private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(100,400,50,50,3);
		//alienOne = new Alien(150,150,30,30,10);
		//alienTwo = new Alien(110,60,30,30,10);
		//ammo = new Ammo(ship.getX() + (ship.getWidth()/2 -1),ship.getY());
		//ammo = new Ammo(170,170);
		shots = new Bullets();
		horde = new AlienHorde(5);
		System.out.println(horde);
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		horde.drawEmAll(window);
		//ammo.draw(graphToBack);

		boolean ammoExist = false;
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
			ship.draw(window);
		}
		if (keys[1] == true) {
			ship.move("RIGHT");
			ship.draw(window);
		}
		if (keys[2] == true) {
			ship.move("UP");
			ship.draw(window);
		}
		if (keys[3] == true) {
			ship.move("DOWN");
			ship.draw(window);
		}
		if (keys[4] == true) {
			//ammo = new Ammo(ship.getX() + (ship.getWidth()/2 -1),ship.getY());
			shots.add(new Ammo((ship.getX() + (ship.getWidth()/2)), ship.getY()-5,3));
			System.out.println(shots);
		}
		//moveAmmo(ammoExist,window);
		
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		horde.drawEmAll(graphToBack);
		horde.removeDeadOnes(shots.getList());
		horde.moveEmAll();
		shots.drawEmAll(graphToBack);
		horde.drawEmAll(graphToBack);
		horde.hitBottom(graphToBack);
		
		//ammo.move("DOWN");
		//ammo.draw(window);
		//add code to move Ship, Alien, etc.
		/*for (int i = 0; i < shots.getList().size(); i++) {
			Ammo ammo = shots.getAmmo(i);
			if (ammo.getX() + ammo.getWidth() >= alienTwo.getX() && ammo.getX() <= (alienTwo.getX() + alienTwo.getWidth())) {
				if (ammo.getY() <= alienTwo.getY() + alienTwo.getHeight() && ammo.getY() >= alienTwo.getY()) {
					System.out.println("alienTwo has been hit");
				}
			}
			if (ammo.getX() + ammo.getWidth() >= ship.getX() && ammo.getX() <= (ship.getX() + ship.getWidth())) {
				if (ammo.getY() >= ship.getY() && ammo.getY() <= ship.getY() + ship.getHeight()) {
					System.out.println("ship has been hit");
				}
			}
		}*/
		
		
		
		

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		
		//

		twoDGraph.drawImage(back, null, 0, 0);
	}
	


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
			System.out.println("Space bar has been hit");
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

