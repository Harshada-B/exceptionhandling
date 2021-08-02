package com.yash.ExceptionHandling;
/*The Double.parseDouble() method requires a String argument, but it fails if the String cannot be 
converted to a floating-point number. Write an application in which you try accepting a double input 
from a user and catch a NumberFormatException if one is thrown. The catch block forces the 
number to 0 and displays an appropriate error message.*/
public class AssignExcep2 
{
	public static void main(String args[])
	{
		String str="qweqa";//if we give str=null we get nullpointerException
		try
		{
			double val=Double.parseDouble(str);
			System.out.println("value = "+val);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
	}
}
