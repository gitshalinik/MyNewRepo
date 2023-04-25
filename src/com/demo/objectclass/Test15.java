package com.demo.objectclass;


public class Test15
{
	public static void main(String[] args)   
	{
		try
		{
			Hi i am pritam
			String s1 = null;
			System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Other code: ");	
	}
}