//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      upperBody(window);
      lowerBody(window);

      //call other methods

   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.GREEN);
      window.fillOval(350, 125, 25, 25);
      window.fillOval(425, 125, 25, 25);

      window.setColor(Color.BLACK);
      window.fillOval(385, 150, 25, 12);

      window.setColor(Color.RED);
      window.drawArc(330,160, 135, 25, 180, 180);


		//add more code here

   }

   public void upperBody( Graphics window )
   {
	window.setColor(Color.BLUE);
    window.fillRect(330, 220, 140, 75);
    window.setColor(Color.YELLOW);
    window.drawRect(330, 220, 140, 75);
    window.setColor(Color.BLACK);
    window.drawLine(250, 190, 325, 230);
    window.setColor(Color.BLACK);
    window.drawLine(475, 230, 540, 190);

		//add more code here
   }

   public void lowerBody( Graphics window )
   {
   	window.setColor(Color.GRAY);
    window.fillRect(330, 310, 140, 75);
    window.setColor(Color.YELLOW);
    window.drawRect(330, 310, 140, 75);
    window.setColor(Color.BLACK);
    window.drawLine(250, 430, 325, 380);
    window.setColor(Color.BLACK);
    window.drawLine(250, 430, 325, 380);
    window.setColor(Color.BLACK);
    window.drawLine(475, 385, 555, 440);


		//add more code here

   }
}