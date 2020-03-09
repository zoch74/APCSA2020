package ShapeLab;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MovingShapePanel extends JPanel implements Runnable
{
	private Shape sh, sh1;

	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		sh = new Shape(30, 30, 30, 30, Color.WHITE, 20, 20);
		sh1 = new Shape(70, 70, 30, 30, Color.BLACK, 20, 20);
		//refer sh to a new Shape
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(sh);
		shapes.add(sh1);


		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		//tell sh to move and draw

		//this code handles the left and right walls
		// uncomment once Shape is built
		 
		if(!(sh.getX()>=10 && sh.getX()<=730))
		{
			sh.setXSpeed(-sh.getXSpeed());
		}
		

		//add code to handle the top and bottom walls
		
		if (!(sh.getY() >= 10 && sh.getY() <= getHeight() - sh.getHeight())){
			sh,setYSpeed(-sh.getYSpeed());
		}

	}
	
	

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}