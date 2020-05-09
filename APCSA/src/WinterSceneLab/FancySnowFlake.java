package WinterSceneLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape
{
	public FancySnowFlake(int x, int y, int w, int h )
	   {
			super(x, y, w, h, Color.WHITE, 0, 3);
	   }

	
	
	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
		
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.white);
	    setXPos(getXPos()+getXSpeed());
			//setY
	    setYPos(getYPos()+getYSpeed());
			//draw the ball at its new location
	    draw(window);
	}
}

