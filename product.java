package com.yash.ExceptionHandling;

public class product 
{

	int id;
	String name;
	void setDetails(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void getDetails()
	{
		System.out.println("product Id is: "+id+ "product Name is:" +name);
	}
}
