package com.pack1;

interface AA
{
	void m1();
}

class BB implements AA
{
	@Override
	public void m1() 
	{
		int a = 10;
		System.out.println(a);
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
