package net.teddoyle.binMath;
/**
 * FullAdder
 *    This class implements the functions of a full adder a component
 *  used perform arithmetic inside of a CPU. 
 * 
 * This program was written by Edward "Ted" Doyle in Early June, 2001
 * in order to show an undergraduate class in computer architecture
 * how a computer adds and subtracts four bit integers.
 *    The program was written while I, Edward Doyle, was a teaching
 * assistant working for Clemson University, in Clemson , SC, USA. 
 */

public class FullAdder {
	int sum;
	int carry;

	   FullAdder()
	   {
	      sum = 0;
	      carry = 0;
	   }

	   public int evaluate(int A, int B, int carryIn)
	   {
	      sum = A + B + carryIn;
	      carry = sum > 1 ? 1 : 0;
	      sum %= 2;
	      return sum;
	   }

	   public int getCarry()
	   {
	      return carry;
	   }
}
