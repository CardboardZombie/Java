/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
This Program is for Day 7 Lab 1
*/

public class D7L1Task2
{
	public static void main(String[] args)
	{
		int count = 1;
		while(count < 8)
		{
			printWarningMessage(count);
			count++;
		}
	}
	public static void printWarningMessage(int c)
	{
		System.out.println("\"This is a warning message\" : "+c);
	}
}