/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Add another loop to the program that will print the 
String repeatedly such that it is in lower on ODD
or upper on EVEN loop Counter Values

Input:

Hello World
5

Output:

hello world
HELLO WORLD
hello world
HELLO WORLD
hello world

*/
import java.util.Scanner;
public class D8L2Task4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int n = sc.nextInt();
		System.out.println();
		for(int i = 1; i <= n; i++)
		{
			if(i%2== 0)
				System.out.println(s.toUpperCase());
			else
				System.out.println(s.toLowerCase());
		}
		System.out.println();
	}
}