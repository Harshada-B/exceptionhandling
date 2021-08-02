package com.yash.ExceptionHandling;

public class Assign_1_4
{
	public static void main(String args[])
	{
			try
			{
				product p=new product();
				product p1=new product();
				product p3=new product();
				p.setDetails(1, "mobile");
				p.getDetails();
				p1.setDetails(2,"bottle");
				p1.getDetails();
				p3.setDetails(0, null);
				String [] num= {"harry","max","ment","donald","angad"};
				System.out.println(num[6]);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
}
