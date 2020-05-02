package PongLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setColor(Color.blue);
		setPos(100,200);
		setWidth(20);
		setHeight(20);

	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		setColor(Color.cyan);
		setPos(x, y);
		setWidth(50);
		setHeight(50);
	}
	
	public Block(int xPos, int yPos, int width, int height) {
		setColor(Color.black);
		setPos(xPos, yPos);
		setWidth(width);
		setHeight(height);
	}
	
	
	public Block(int xPos, int yPos, int width, int height, Color color) {
		setColor(color);
		setPos(xPos, yPos);
		setWidth(width);
		setHeight(height);
	}

	
   //add the other set methods

   public int getX() {
		return xPos;
	}

	
	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public void setX(int x) {
		xPos = x;
	}
	
	@Override
	public void setY(int y) {
		yPos = y;
	}

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

public void setColor(Color col)
   {
		color = col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block testBlock = (Block) obj;
		if (this.getColor().equals(testBlock.getColor()) && this.getWidth() == testBlock.getWidth() && this.getHeight() == testBlock.getHeight()) {
			return true;
		}
		else {
			return false;
		}

	}   

    

   //add a toString() method  - x , y , width, height, color
	
	public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
				 
	}
	
	
	
}