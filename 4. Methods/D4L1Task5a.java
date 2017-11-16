/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
This Program is for Day 4 Lab 1
*/

public class D4L1Task5a
{
	public static void main(String[] args)
	{
		int i = 1;
		int x = 7;
		int sigma = 0;
		while(i<=x)
		{
			sigma += i;
			System.out.println(i);
			i++;
		}
		System.out.println(sigma);
	}
}