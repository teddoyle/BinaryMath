package net.teddoyle.binMath;
/**
 * FullAdderCanvas
 *    This class draws a box with the words full adder on it and was
 *  part of the GUI. 
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

public class FullAdderCanvas extends Canvas {
	   public FullAdderCanvas()
	   {
	      super();
	      // setBackgroundColor( );
	      // setSize(WIDTH, HEIGHT);
	      setVisible(true);
	   }  // end constructor

	   public void paint(Graphics g)
	   {
	      int width = getWidth();
	      int height = getHeight();

	      g.setColor(Color.black);
	      g.drawRect(0, 0, width - 1, height - 1);
	      g.drawString("FULL", (width / 8), height / 3);
	      g.drawString("ADDER", (width / 8) + 10, (2 * height) / 3);
	   }  // end paint
}
