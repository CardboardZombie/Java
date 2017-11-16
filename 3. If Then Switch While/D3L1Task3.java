/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	30/8/2017

Description:
This Program is for Day 3 Lab 1
*/

public class D3L1Task3
{
	public static void main(String[] args)
	{
		int n = 657;
		int n1, n2, n3;
		
		n1 = n%10;	//n1 will have the value of 8
		n /= 10;	//n = 25
		n2 = n%10; 	//n2 will have the value of 5
		n /= 10;	//n = 2
		n3 = n%10;	//n3 will have the value of 2
		
		
		System.out.println("The number "+n+" broken down is:")
		
		System.out.println(n3);
		
		System.out.println(n2);
		
		System.out.println(n1);
		
		System.out.println("Goodbye!")
	}
}