/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	7/9/2017

Description:
This Program is for Day 9 Lab 1

Task:
Write a program called starRectangle that 
takes in the number of rows and the number of stars in each row 
and prints out a rectangle with that many stars in each row of stars. For
example, the following has 4 rows and 12 stars in each row. 

************
************
************
************

*/
import java.util.Scanner;
public class starTriangles
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size: ");
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}