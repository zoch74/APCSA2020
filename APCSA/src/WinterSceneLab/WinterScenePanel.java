package WinterSceneLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private Tree tree;

	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<>();

		//populate the list with 50 unique snowflakes
		int tempX,tempY,tempR;
		
		for (int i = 0; i <50; i++) {
			tempX = (int)(Math.random() * (800 - 0) + 1);		//use Math.random()
	 		tempY = (int)(Math.random() * (550 - 0) + 1);
	 		tempR = (int)(Math.random() * (20 - 0) + 10);
			shapes.add(new FancySnowFlake(tempX,tempY,tempR,tempR));
		}
		

		//instantiate a snowman
		tree = new Tree(80,450,200,400);
		sMan = new SnowMan(300,350,200,200);
		

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);

		//make the snowman appear
		sMan.draw(window);
		tree.draw(window);
		//make the snowflakes appear and move down the screen
		for(int i = 0; i < 50; i++) {
			shapes.get(i).moveAndDraw(window);
		}
		
		//check to see if any of the snowflakes need to be reset to the top of the screen
		for (int i = 0; i < 50; i++) {
			if (shapes.get(i).getYPos() >= 580) {
				shapes.get(i).setYPos(0);
			}
		}
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}