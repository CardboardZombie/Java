/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	7/9/2017

Description:
This Program is for Day 9 Lab 1

Task:
Without using the Math class, 
write a method which calculates the power of one number raised
to another. The method would be used as follows:


Input:

int x = pow(2, 5); // 2^5 = 32
int x = pow(3, 4); // 3^4 = 81

Output:

2^5: 32
3^4: 81

*/

public class D9L1Task3
{
	public static void main(String[] args)
	{
		int [] numbers = {2, 10, 0, 5, 17, 8, 10, 23, 9};
		int x = pow(2,5);
		System.out.println("2^5: "+x);
		x = pow(3,4);
		System.out.println("3^4: "+x);
	}
	public static int pow(int x, int p)
	{
		int r = 1;
		for(int i = 0; i < p; i++)
		{
			r *= x;
		}
		return r;
	}
}