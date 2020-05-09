package WinterSceneLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
      window.fillOval(getXPos()+15, getYPos()-(getHeight()/2), getWidth()-30, getHeight()-30);
      window.fillOval(getXPos()+30, getYPos()-getHeight(), getWidth()-60, getHeight()-60);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}