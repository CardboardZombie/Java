/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Description:
Write a program that takes in consecutive integers
from the keyboard using Scanner and a loop, that multiplies them,
keeping a running total which is printed for the user.

THE PROGRAM SHOULD EXIT WHEN ZERO IS ENTERED
*/
import java.util.Scanner;
public class D8L1Task3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean isZero = false;
		int t = 1;
		while(!isZero)
		{
			int i = sc.nextInt();
			if(i > 0)
				t*=i;
			else
				isZero = true;
			
			System.out.println(t);
		}
		
		
	}
}