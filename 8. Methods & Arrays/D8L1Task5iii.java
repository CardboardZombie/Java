/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Description:
This Program is for Day 8 Lab 1
Use a loop to print the following:
*****
****
***
**
*

*/
public class D8L1Task5iii
{
	public static void main(String[] args)
	{
		String s = "*";

		for(int i = 5; i>0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}
}