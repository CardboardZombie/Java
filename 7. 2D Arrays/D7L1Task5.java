/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
This Program is for Day 7 Lab 1
*/
import java.util.Scanner;

public class D7L1Task5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\"Enter the number of times you want to print the warning message :");
		int n = sc.nextInt();
		
		int count = 1;
		while(count <= n)
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