/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
This Program is for Day 4 Lab 2
*/

public class D4L2Task3
{
	public static void main(String[] args)
	{
		
		int x = 2;
		while(x <= 12)
		{
			int i = 1;
			int factorial = 1;
			while(i<=x)
			{
				factorial *= i;
				i++;
			}
			System.out.println(factorial);
			x++;
		}
		
	}
}