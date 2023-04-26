package com.demo.objectclass;


public class Test1
{
	public static void main(String[] args)   
	{
		try
		{
			System.out.println("Execution Start");
			System.out.println("Try Block Start");
			System.out.println("This changes is from D1111");
			int a = 20;
			System.out.println(a);
			String s1 = null;
			System.out.println(s1.length());
			System.out.println("Try Block Ends");
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
		System.out.println("Execution Stop");	
	}
}