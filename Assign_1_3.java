package com.yash.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_1_3
{

	public static void main(String args[])
	{
		int [] array= {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
	
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array index");
			int n=sc.nextInt();
			System.out.println("array value at index :"+array[n]);
				
		}
		catch(Exception e)
		{
			System.out.println("The Index should be within 0 to 4");
		}
	}
}
