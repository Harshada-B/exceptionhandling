package com.yash.ExceptionHandling;

import java.util.Scanner;

/*Q1.Write an application named IndexTest in which you declare an array of 10 first names. Write a try 
block in which you prompt the user for an integer and display the name in the requested position. 
Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown when the 
user enters a number that is out of range. The catch block should also display an error message*/
public class IndexTest
{
	public static void main(String args[])
	{
	String [] FirstName= {"neha","usha","mega","jack","harry","lucifer","sohum","loca","marry","lang"};
	String n;
	try
	{
		System.out.println("Enter the name from 1 to 10 to display a name:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextLine();
		int i=Integer.parseInt(n);
		i=i-1;
		System.out.println(FirstName[i]);
		sc.close();
	}
	catch(Exception e)
	{
		System.out.println("Error:"+e);
	}
	}
}