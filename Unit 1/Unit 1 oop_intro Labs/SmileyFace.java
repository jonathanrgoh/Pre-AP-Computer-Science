//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
	public static void main(String[] args)
   {

   }
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      window.setColor(Color.GREEN);
      window.fillOval( 300, 220, 75, 50);

      window.setColor(Color.GREEN);
      window.fillOval( 430, 220, 75, 50);

      window.setColor(Color.BLACK);
      window.fillOval( 385, 300, 35, 35);

      window.setColor(Color.RED);
      window.drawArc( 285, 385, 230, 50, 180, 180);

		//add more code here


   }
}