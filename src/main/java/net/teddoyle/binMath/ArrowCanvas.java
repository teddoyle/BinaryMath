package net.teddoyle.binMath;
/**
 * ArrowCanvas
 *    This class draws a arrow on the the GUI. 
 * 
 * This program was written by Edward "Ted" Doyle in Early June, 2001
 * in order to show an undergraduate class in computer architecture
 * how a computer adds and subtracts four bit integers.
 *    The program was written while I, Edward Doyle, was a teaching
 * assistant working for Clemson University, in Clemson , SC, USA. 
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ArrowCanvas extends Canvas {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean towardsLeft = true;
	   boolean towardsRight = true;

	   public ArrowCanvas()
	   {
	      super();
	      // setBackgroundColor( );
	      towardsRight = false;
	      towardsLeft = true;  // by default draw the arrow to the left
	      // setSize(20, 20);
	      setVisible(true);
	   }  // end constructor

	     // needs two methods:  setLeft and a setRight 

	   public void setLeft(boolean newValue)
	   {
	      towardsLeft = newValue;
	   } // end method setLeft

	   public void setRight(boolean newValue)
	   {
	      towardsRight = newValue;
	   } // end method setRight


	   public void paint(Graphics g)
	   {
	      int width = getWidth();
	      int height = getHeight();

	      g.setColor(Color.black);
	      // g.drawLine(0, 10, 20, 10);  // draw arrow shaft 20 x 20
	      g.drawLine(0, height / 2, width, height / 2);  // draw arrow shaft
	      if (towardsLeft)
	      {
	         g.drawLine(0, height / 2, width / 4, 4 * height / 10);
	         g.drawLine(0, height / 2, width / 4, 6 * height / 10);
	         // old code for 20x20
	         // g.drawLine(0, 10, 5, 7);
	         // g.drawLine(0, 10, 5, 13);
	      }
	      if (towardsRight)
	      {
	         g.drawLine(width, height / 2, (3 * width) / 4, 4 * height / 10 );
	         g.drawLine(width, height / 2, (3 * width) / 4, 6 * height / 10 );
	         // old code for 20 x 20
	         // g.drawLine(20, 10, 15, 7);
	         // g.drawLine(20, 10, 15, 13);
	      }
	   }  // end paint
}
