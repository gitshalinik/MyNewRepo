package com.demo.objectclass;


public class Test12
{
	public static void main(String[] args)   
	{
		try
		{
			System.out.println("Start Try block Execution_TM1");
			System.out.println("Changes done by Pooja");
			String s1 = null;
			System.out.println(s1.length());
			System.out.println("Try block execution end_TM2");
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