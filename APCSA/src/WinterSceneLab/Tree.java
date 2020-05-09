package WinterSceneLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape
{
   public Tree(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.green, 0, 0);
   }

   public void draw(Graphics window)
   {
      //window.fillTriangle(getXPos(), getYPos(), getWidth(), getHeight());
     // window.fillOval(getXPos()+15, getYPos()-(getHeight()/2), getWidth()-30, getHeight()-30);
      //window.fillOval(getXPos()+30, getYPos()-getHeight(), getWidth()-60, getHeight()-60);
	   window.setColor(Color.green);
	   window.fillPolygon(new int[] {getXPos(), getXPos()+(getWidth()/2), getXPos()+getWidth()}, new int[] {getYPos(), getYPos()-getHeight(), getYPos()}, 3);
	   window.setColor(Color.black);
	   window.fillRect(getXPos()+(getWidth()/4), getYPos(), getWidth()/2, 70);
   }

   public void moveAndDraw(Graphics window)
   {
	  
      draw(window);   
   }
}