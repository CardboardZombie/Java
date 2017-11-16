/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
This Program is for Day 7 Lab 1
*/

public class D7L1Task1
{
	public static void main(String[] args)
	{
		int count = 0;
		while(count < 5)
		{
			printWarningMessage();
			count++;
		}
	}
	public static void printWarningMessage()
	{
		System.out.println("This is a warning message");
	}
}