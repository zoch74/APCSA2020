package PongLab;
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

public class Pong2 extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private BlinkyBall bBall;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore;
	private int leftScore;


	public Pong2()
	{
		//set up all variables related to the game
		
		ball = new Ball();
		
		bBall = new BlinkyBall();
		
		leftPaddle = new Paddle(10, 10, 30, 100);
		
		rightPaddle = new Paddle(760, 10, 30, 100);

		keys = new boolean[4];

		rightScore = 0;
		
		leftScore = 0;
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		bBall.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if bBall hits left wall or right wall
		if(bBall.getX()<=10)
		{
			bBall.setxSpeed(-bBall.getxSpeed());
			rightScore++;
			System.out.println("right: " + rightScore);
			
		}
		
		if(bBall.getX()>=780)
		{
			bBall.setxSpeed(-bBall.getxSpeed());
			leftScore++;
			System.out.println("left: " + leftScore);
		}

		
		//see if the bBall hits the top or bottom wall 
		if(!(bBall.getY()>=10 && bBall.getY()<=550))
		{
			bBall.setySpeed(-bBall.getySpeed());
		}



		//see if the bBall hits the left paddle
		
		if (bBall.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(bBall.getxSpeed()) && (bBall.getY() >= leftPaddle.getY() && bBall.getY() <= leftPaddle.getY() + leftPaddle.getHeight() || bBall.getY() + bBall.getHeight() >= leftPaddle.getY() && bBall.getY() + bBall.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())){
			
			if (bBall.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(bBall.getxSpeed())) {
				bBall.setySpeed(-bBall.getySpeed());
			}
			else {
				bBall.setxSpeed(-bBall.getxSpeed());
			}
		}
		
		
		//see if the bBall hits the right paddle -- NEED TO FIX
		
		if (bBall.getX() >= rightPaddle.getX() && bBall.getX() < rightPaddle.getX() + rightPaddle.getWidth() + Math.abs(bBall.getxSpeed()) && bBall.getY() >= rightPaddle.getY() && bBall.getY() <= rightPaddle.getY() + rightPaddle.getHeight()) {
			if (bBall.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(bBall.getxSpeed())) {
				bBall.setySpeed(-bBall.getySpeed());
			}
			else {
				bBall.setxSpeed(-bBall.getxSpeed());
			}
		}
		
		
		if (bBall.didCollideRight(rightPaddle)) {
			bBall.setySpeed(-bBall.getySpeed());
		}
		
		
		/*
		if (bBall.getX() >= rightPaddle.getX() + rightPaddle.getWidth() + Math.abs(bBall.getxSpeed()) && (bBall.getY() >= rightPaddle.getY() && bBall.getY() <= rightPaddle.getY() + rightPaddle.getHeight() || bBall.getY() + bBall.getHeight() >= rightPaddle.getY() && bBall.getY() + bBall.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())){
			
			if (bBall.getX() >= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(bBall.getxSpeed())) {
				bBall.setySpeed(-bBall.getySpeed());
			}
			else {
				bBall.setxSpeed(-bBall.getxSpeed());
			}
		}*/
		
		if (leftPaddle.getY() < 0)
			leftPaddle.setY(0);
		
		if (rightPaddle.getY() < 0)
			rightPaddle.setY(0);
		
		if (leftPaddle.getY() > 500)
			leftPaddle.setY(500);
		
		if (rightPaddle.getY() > 500)
			rightPaddle.setY(500);


		//see if the paddles need to be moved
		
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
			
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}








		

		
		twoDGraph.drawImage(back, null, 0, 0);
		
		twoDGraph.setColor(Color.black);
		twoDGraph.drawRect(2, 2, 800, 600);
		twoDGraph.drawString("Left Score: " + Integer.toString(leftScore), 20, 520);
		twoDGraph.drawString("Right Score: " + Integer.toString(rightScore), 20, 550);
		
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}