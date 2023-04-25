package com.demo.objectclass;

import java.lang.reflect.Method;

public class Emp1
{

	public static void main(String[] args)
	{
		Object o1 = new Object();
		Class c1 = o1.getClass();
		
		Method[] m = c1.getDeclaredMethods();
		int n=0;
		for(int i=0; i<=m.length-1; i++)
		{
			Method m1 = m[i];
			String name = m1.getName();
			System.out.println(name);
			n++;
		}
		System.out.println("Total num of method in Object class = "+n);
	}
}