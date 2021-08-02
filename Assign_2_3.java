package com.yash.ExceptionHandling;
import java.util.Scanner;

/* Write a Java program which will take array size as input from the user, and then attempt to 
declare an array using the entered size. If the array is created successfully, display an appropriate 
message. Java generates a NegativeArraySizeException if you attempt to create an array with a 
negative size, and it creates a NumberFormatException if you attempt to create an arrayusing a 
nonnumeric value for the size. Use a catch block that executes if the array size is nonnumeric or 
negative, displaying a message that indicates the array wasnot created.*/
public class Assign_2_3 
{
	public static void main(String[] args) 
	 {
	      Scanner sc = new Scanner(System.in);
	      int size;
	      int [] array;
	      System.out.println("Enter the required size of the array :: ");
	      size=sc.nextInt();
	      try
	      {
	    	array=new int[size];  
	      }
	      catch(NegativeArraySizeException e)
	      {
	    	  System.out.println("Negative size of the array :: ");
	    	  System.out.println("array is not create:"+e);
	    	  return;
	      }
	      catch(NumberFormatException e)
	      {
	    	  System.out.println("Error numeric format:: ");
	    	  System.out.println("array is not create:"+e);
	    	  return;
	      }
	      System.out.println("array created:\nEnter values in array");
    	  for(int i=0;i<size;i++)
    		  array[i]=sc.nextInt();
    	  System.out.println("enter the index we want:");
    	  size=sc.nextInt();
    	  try
    	  {
    		  System.out.println(array[size-1]);
    	  }
    	  catch(ArrayIndexOutOfBoundsException e)
    	  {
    		  System.out.println("index error:"+e);
    	  }
	}

}