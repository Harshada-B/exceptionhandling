package com.yash.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign_1_5 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product details:");
		
		ProductApp pr[]=new ProductApp[2];
		try
		{
		for(int i=0;i<pr.length;i++)
		{
			System.out.println("For product:"+(i+1));
			System.out.println("Name:");
			String ProductName=sc.next();
			System.out.println("price:");
			double ProductPrice=sc.nextDouble();
			pr[i]=new ProductApp();
		}
		}
		catch(NumberFormatException |InputMismatchException e)
		{
			System.out.println("type is not correct for name and price");
		}
		System.out.println("Product details are:");
		for(int i=0;i<pr.length;i++)
		{
			System.out.println("ProductApp:"+(i+1)+"\n"+pr[i]);
		}
		
	}
}
