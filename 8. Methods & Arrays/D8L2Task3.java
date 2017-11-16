/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Reusing Q2, add another loop to the program that prints
the contents of the string backwards.

Input:

Hello World

Output:
Hello World
dlroW olleH

*/
import java.util.Scanner;
public class D8L2Task3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println();
		for(int i = 0; i < s.length(); i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(int i = s.length()-1; i >= 0 ; i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
}