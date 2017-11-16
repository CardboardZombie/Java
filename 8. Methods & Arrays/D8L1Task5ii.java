/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Description:
This Program is for Day 8 Lab 1
Use a loop to print the following:
*****
*****
*****
*****
*****

*/
public class D8L1Task5ii
{
	public static void main(String[] args)
	{
		String s = "*";
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}
}