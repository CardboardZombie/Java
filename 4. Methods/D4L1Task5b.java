/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	30/8/2017

Description:
This Program is for Day 4 Lab 1
*/

public class D4L1Task5b
{
	public static void main(String[] args)
	{
		int sigma;
		sigma = mySigma(2,8);
		System.out.println(sigma);
	}
	public static int mySigma(int y, int x)
	{
		int result = 0;
		while(y <= x)
		{
			result += y;
			System.out.println(y);
			y++;
		}
		return result;
	}
}